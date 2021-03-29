package com.reto.screenplaydespegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AccommodationSectionPage {

    public static final Target ACCOMMODATION_SECTION = Target
            .the("Go to accommodation section")
            .locatedBy("//label[text()='Alojamientos']");
}
