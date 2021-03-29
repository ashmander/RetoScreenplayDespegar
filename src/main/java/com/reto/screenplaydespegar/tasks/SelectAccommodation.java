package com.reto.screenplaydespegar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.RememberThat;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reto.screenplaydespegar.interactions.SwitchWindow.changeWindow;
import static com.reto.screenplaydespegar.userinterface.SelectAccommodationPage.ACCOMMODATION_SELECTED;
import static com.reto.screenplaydespegar.userinterface.SelectAccommodationPage.TITLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectAccommodation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ACCOMMODATION_SELECTED, isVisible()),
                Click.on(ACCOMMODATION_SELECTED),
                changeWindow()
        );
    }

    public static SelectAccommodation selectFirstAccommodation() {
        return instrumented(SelectAccommodation.class);
    }
}
