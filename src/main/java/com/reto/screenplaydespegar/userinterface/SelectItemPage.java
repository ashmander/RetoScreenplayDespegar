package com.reto.screenplaydespegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SelectItemPage {

    public static final Target FIRST_ITEM_SELECTED = Target
            .the("Departure city selected")
            .locatedBy("//div[@class='ac-group-container'][1]/ul/li[1]");
}
