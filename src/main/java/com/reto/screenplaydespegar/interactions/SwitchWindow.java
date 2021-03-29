package com.reto.screenplaydespegar.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwitchWindow implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String currHandle = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.contentEquals(currHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

    public static SwitchWindow changeWindow() {
        return instrumented(SwitchWindow.class);
    }
}
