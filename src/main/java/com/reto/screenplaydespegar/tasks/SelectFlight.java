package com.reto.screenplaydespegar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reto.screenplaydespegar.userinterface.SelectFlightPage.FLIGHTS_SECTION;
import static com.reto.screenplaydespegar.userinterface.SelectFlightPage.FLIGHT_SELECTED;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SelectFlight implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FLIGHT_SELECTED, isEnabled()).forNoMoreThan(20).seconds(),
                Scroll.to(FLIGHTS_SECTION).andAlignToTop(),
                Click.on(FLIGHT_SELECTED)
        );
    }

    public static SelectFlight andSelectFlightToBook() {
        return instrumented(SelectFlight.class);
    }
}
