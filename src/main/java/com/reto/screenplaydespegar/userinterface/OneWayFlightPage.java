package com.reto.screenplaydespegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class OneWayFlightPage {

    public static final Target RADIOBUTTON_ONE_WAY = Target
            .the("Select only one way flight")
            .locatedBy("//span[text()='Solo ida']");

    public static final Target INPUT_DEPARTURE_CITY = Target
            .the("Search departure city")
            .locatedBy("//input[contains(@class, 'roundtrip') and contains(@placeholder, 'desde')]");

    public static final Target INPUT_DESTINATION_CITY = Target
            .the("Search destination city")
            .locatedBy("//input[contains(@class, 'roundtrip') and contains(@placeholder, 'hacia')]");

    public static final Target INPUT_DEPARTURE_DATE = Target
            .the("Select departure date")
            .locatedBy("//input[contains(@class, 'bind-value-start-date-segment-1 sbox') and contains(@placeholder, 'Ida')]");

    public static final Target DATE_SELECTED = Target
            .the("Date selected")
            .locatedBy("//div[contains(@class, 'datepicker-flights-main')]//div[@class='_dpmg2--months']//div[@data-month='{0}']//span[text()='{1}']//parent::span[1]");

    public static final Target SEARCH_BUTTON = Target
            .the("Search flights")
            .locatedBy("//div[contains(@class, '-mt5-l')]/div/a");

    public static final Target SEARCH_BUTTON_ALTERNATIVE = Target
            .the("Search flights")
            .locatedBy("//div[@class='sbox-button -ml3-l']/div/a");

    public static final Target INPUT_RETURN_DATE = Target
            .the("Select departure date")
            .locatedBy("//input[@disabled and contains(@placeholder, 'Regreso')]");
}
