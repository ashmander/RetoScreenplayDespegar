package com.reto.screenplaydespegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SelectAccommodationPage {

    public static final Target ACCOMMODATION_SELECTED = Target
            .the("Select the first accommodation")
            .locatedBy("//div[@class='results-cluster-container'][1]//em[text()='Ver detalle']//parent::button");

    public static final Target TITLE = Target
            .the("Verify the title")
            .locatedBy("(//span[@class='accommodation-name -eva-3-ellipsis'])[1]");
}
