package com.reto.screenplaydespegar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reto.screenplaydespegar.userinterface.BookAccommodationNowPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BookAccommodationNow implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOOK_ACCOMMODATION_NOW, isEnabled()),
                Scroll.to(BOOK_ACCOMMODATION_NOW),
                WaitUntil.the(BUTTON_BOOK_NOW, isVisible()),
                Click.on(BUTTON_BOOK_NOW),
                WaitUntil.the(BUTTON_CONTINUE, isVisible()),
                Click.on(BUTTON_CONTINUE)
        );
    }

    public static BookAccommodationNow confirmAccommodationBook() {
        return instrumented(BookAccommodationNow.class);
    }
}
