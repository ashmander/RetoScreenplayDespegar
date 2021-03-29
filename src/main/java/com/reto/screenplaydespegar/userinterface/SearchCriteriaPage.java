package com.reto.screenplaydespegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SearchCriteriaPage {

    public static final Target SEARCH_CRITERIA = Target
            .the("Scroll to see the date")
            .locatedBy("//div[@class='home-ui-searchbox-container ']");
}
