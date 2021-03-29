package com.reto.screenplaydespegar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reto.screenplaydespegar.userinterface.RoomReservationPage.*;
import static com.reto.screenplaydespegar.userinterface.SelectItemPage.FIRST_ITEM_SELECTED;
import static com.reto.screenplaydespegar.utils.TransformDate.getDay;
import static com.reto.screenplaydespegar.utils.TransformDate.getYearAndMonth;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RoomReservation implements Task {

    private com.reto.screenplaydespegar.model.RoomReservation roomReservation;

    public RoomReservation(com.reto.screenplaydespegar.model.RoomReservation roomReservation) {
        this.roomReservation = roomReservation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_DESTINATION_CITY, isVisible()),
                Click.on(INPUT_DESTINATION_CITY),
                Clear.field(INPUT_DESTINATION_CITY),
                Enter.theValue(roomReservation.getDestinationCity()).into(INPUT_DESTINATION_CITY),
                WaitUntil.the(FIRST_ITEM_SELECTED, isVisible()),
                Click.on(FIRST_ITEM_SELECTED),
                Click.on(INPUT_ARRIVED_DATE),
                Click.on(DATE_SELECTED.of(getYearAndMonth(roomReservation.getArrivedDate()), getDay(roomReservation.getArrivedDate()))),
                Click.on(DATE_SELECTED.of(getYearAndMonth(roomReservation.getDepartureDate()), getDay(roomReservation.getDepartureDate()))),
                JavaScriptClick.on(SEARCH_BUTTON)
        );
    }

    public static RoomReservation bookRoomWith(com.reto.screenplaydespegar.model.RoomReservation roomReservation) {
        return instrumented(RoomReservation.class, roomReservation);
    }
}
