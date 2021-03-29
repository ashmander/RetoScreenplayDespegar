package com.reto.screenplaydespegar.stepdefinitions;

import com.reto.screenplaydespegar.questions.TheButtonTo;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.reto.screenplaydespegar.model.RoomReservationBuilder.destinationCity;
import static com.reto.screenplaydespegar.tasks.AccommodationSection.andSelectAccommodationSection;
import static com.reto.screenplaydespegar.tasks.BookAccommodationNow.confirmAccommodationBook;
import static com.reto.screenplaydespegar.tasks.RoomReservation.bookRoomWith;
import static com.reto.screenplaydespegar.tasks.SelectAccommodation.selectFirstAccommodation;
import static com.reto.screenplaydespegar.utils.TransformDate.threeDaysAfterTomorrow;
import static com.reto.screenplaydespegar.utils.TransformDate.tomorrow;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BookRoomStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) wants book a room in Santa Marta$")
    public void andresWantsBookARoomInSantaMarta(String actor) {
        theActorCalled(actor).wasAbleTo(
                Open.url("https://www.despegar.com.co"),
                andSelectAccommodationSection()
        );
    }

    @When("^Andres book the room in Santa Marta$")
    public void andresBookTheRoomInSantaMarta() {
        theActorInTheSpotlight().attemptsTo(
                bookRoomWith(destinationCity("Santa Marta")
                        .arrivedDate(tomorrow())
                        .departureDate(threeDaysAfterTomorrow())),
                selectFirstAccommodation(),
                confirmAccommodationBook()
        );
    }

    @Then("^Andres should see the button to buy the reserve$")
    public void andresShouldSeeTheButtonToBuyTheReserve() {
        theActorInTheSpotlight().should(seeThat(TheButtonTo.bookAccommodationIsVisible()));
    }
}
