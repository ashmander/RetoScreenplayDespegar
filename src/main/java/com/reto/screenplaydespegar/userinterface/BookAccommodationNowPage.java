package com.reto.screenplaydespegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class BookAccommodationNowPage {

    public static final Target BOOK_ACCOMMODATION_NOW = Target
            .the("Book accommodation now")
            .locatedBy("//div[@id='roompacks-container-wrapper']");

    public static final Target BUTTON_BOOK_NOW = Target
            .the("Click on the book now button")
            .locatedBy("//em[text()='Reservar ahora']//parent::button");

    public static final Target BUTTON_CONTINUE = Target
            .the("Continue to book accommodation")
            .locatedBy("//em[text()='Siguiente']//parent::button");
}
