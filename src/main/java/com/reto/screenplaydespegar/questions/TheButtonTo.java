package com.reto.screenplaydespegar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reto.screenplaydespegar.userinterface.BuyButton.BUTTON_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class TheButtonTo implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(BUTTON_BUTTON, isEnabled());
        Scroll.to(BUTTON_BUTTON);
        return BUTTON_BUTTON.resolveFor(actor).isVisible();
    }

    public static TheButtonTo buyFlightIsVisible() {
        return new TheButtonTo();
    }

    public static TheButtonTo bookAccommodationIsVisible() {
        return new TheButtonTo();
    }
}
