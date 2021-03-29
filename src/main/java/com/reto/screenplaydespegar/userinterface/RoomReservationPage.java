package com.reto.screenplaydespegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RoomReservationPage {

    public static final Target INPUT_DESTINATION_CITY = Target
            .the("Search the destination city")
            .locatedBy("//input[contains(@placeholder, 'ciudad') and @class='input-tag']");

    public static final Target INPUT_ARRIVED_DATE = Target
            .the("Open calendar to select the arrived date")
            .locatedBy("//input[contains(@placeholder, 'Entrada') and @class='input-tag']");

    public static final Target DATE_SELECTED = Target
            .the("Select the date")
            .locatedBy("//div[@data-month='{0}']//div[text()={1}]");

    public static final Target SEARCH_BUTTON = Target
            .the("Search the accommodations available")
            .locatedBy("//em[text()='Buscar']//parent::button");
}
