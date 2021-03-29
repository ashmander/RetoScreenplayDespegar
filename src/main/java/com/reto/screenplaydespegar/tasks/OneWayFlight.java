package com.reto.screenplaydespegar.tasks;

import com.reto.screenplaydespegar.exceptions.NotIsAOneWayFlightError;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;

import static com.reto.screenplaydespegar.exceptions.NotIsAOneWayFlightError.notIsAOneWayFlight;
import static com.reto.screenplaydespegar.userinterface.OneWayFlightPage.*;
import static com.reto.screenplaydespegar.userinterface.SearchCriteriaPage.SEARCH_CRITERIA;
import static com.reto.screenplaydespegar.userinterface.SelectItemPage.FIRST_ITEM_SELECTED;
import static com.reto.screenplaydespegar.utils.TransformDate.getDay;
import static com.reto.screenplaydespegar.utils.TransformDate.getYearAndMonth;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class OneWayFlight implements Task {

    private final com.reto.screenplaydespegar.model.OneWayFlight oneWayFlight;

    public OneWayFlight(com.reto.screenplaydespegar.model.OneWayFlight oneWayFlight) {
        this.oneWayFlight = oneWayFlight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(RADIOBUTTON_ONE_WAY),
                Clear.field(INPUT_DEPARTURE_CITY),
                Enter.theValue(oneWayFlight.getDepartureCity()).into(INPUT_DEPARTURE_CITY),
                Click.on(FIRST_ITEM_SELECTED),
                Clear.field(INPUT_DESTINATION_CITY),
                Enter.theValue(oneWayFlight.getDestinationCity()).into(INPUT_DESTINATION_CITY),
                Click.on(FIRST_ITEM_SELECTED),
                Click.on(INPUT_DEPARTURE_DATE),
                Scroll.to(SEARCH_CRITERIA).andAlignToTop(),
                JavaScriptClick.on(DATE_SELECTED.of(getYearAndMonth(oneWayFlight.getDepartureDate()), getDay(oneWayFlight.getDepartureDate())))
        );
        actor.should(seeThat(the(INPUT_RETURN_DATE), isVisible())
            .orComplainWith(NotIsAOneWayFlightError.class,
                notIsAOneWayFlight()));
        actor.attemptsTo(
                Check.whether(SEARCH_BUTTON.resolveFor(actor).isVisible())
                        .andIfSo(JavaScriptClick.on(SEARCH_BUTTON))
                        .otherwise(JavaScriptClick.on(SEARCH_BUTTON_ALTERNATIVE))
        );
    }

    public static OneWayFlight bookFlightWith(com.reto.screenplaydespegar.model.OneWayFlight oneWayFlight) {
        return instrumented(OneWayFlight.class, oneWayFlight);
    }
}
