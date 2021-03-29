package com.reto.screenplaydespegar.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/book_trip",
        glue = "com.reto.screenplaydespegar.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class BookTrip {
}
