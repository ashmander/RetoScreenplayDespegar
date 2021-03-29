package com.reto.screenplaydespegar.stepdefinitions;

import com.reto.screenplaydespegar.questions.TheButtonTo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.reto.screenplaydespegar.model.OneWayFlightBuilder.departureCity;
import static com.reto.screenplaydespegar.tasks.OneWayFlight.bookFlightWith;
import static com.reto.screenplaydespegar.tasks.SelectFlight.andSelectFlightToBook;
import static com.reto.screenplaydespegar.utils.TransformDate.tomorrow;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BookFlightStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) wants book a flight to Santa Marta$")
    public void openHomePage(String actor) {
        theActorCalled(actor).wasAbleTo(
                Open.url("https://www.despegar.com.co")
        );
    }

    @When("^Andres book the flight from Medellin to Santa Marta$")
    public void bookFlight() {
        theActorInTheSpotlight().attemptsTo(
                bookFlightWith(departureCity("Medellin")
                                .destinationCity("Santa Marta")
                                .departureDate(tomorrow())
                                .totalPassengers(1)),
                andSelectFlightToBook()
        );
    }

    @Then("^Andres should see the button to buy the flight$")
    public void shouldSeeTheButtonToBuyTheFlight() {
        theActorInTheSpotlight().should(seeThat(TheButtonTo.buyFlightIsVisible()));
    }
}
