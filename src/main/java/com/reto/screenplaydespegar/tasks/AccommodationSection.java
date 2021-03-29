package com.reto.screenplaydespegar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.reto.screenplaydespegar.userinterface.AccommodationSectionPage.ACCOMMODATION_SECTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccommodationSection implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ACCOMMODATION_SECTION)
        );
    }

    public static AccommodationSection andSelectAccommodationSection() {
        return instrumented(AccommodationSection.class);
    }
}
