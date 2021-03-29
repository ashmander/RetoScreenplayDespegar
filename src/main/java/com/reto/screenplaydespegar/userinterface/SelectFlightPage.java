package com.reto.screenplaydespegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SelectFlightPage {

    public static final Target FLIGHT_SELECTED = Target
            .the("Select the first flight")
            .locatedBy("//div[@id='clusters']/span[1]//buy-button");

    public static final Target FLIGHTS_SECTION = Target
            .the("Scroll to see the flights list")
            .locatedBy("//div[@id='clusters']/span[1]/div");
}
