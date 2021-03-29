package com.reto.screenplaydespegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class BuyButton {

    public static final Target BUTTON_BUTTON = Target
            .the("Should see the button to buy")
            .locatedBy("//a[@id='buy-button']");
}
