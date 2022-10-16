package co.com.choucair.prueba.stepdefinations;

import co.com.choucair.prueba.model.TestData;
import co.com.choucair.prueba.questions.Check_record_register;
import co.com.choucair.prueba.tasks.Load;
import co.com.choucair.prueba.tasks.OpenUp;
import co.com.choucair.prueba.tasks.RegistrationUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class pruebaStepDefinations {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Duvan wants to enter the user registration url$")
    public void thatDuvanWantsToEnterTheUserRegistrationUrl() {
        theActorCalled("").wasAbleTo(OpenUp.thePage());
    }


    @When("^enter all the appropriate data for user registration on the NewExperience platform$")
    public void enterAllTheAppropriateDataForUserRegistrationOnTheNewExperiencePlatform(List<Map<String, String>> data) {
        theActorInTheSpotlight().wasAbleTo(Load.testData(data.get(0)));
        //System.out.println(TestData.getData().get("correo").toString());
        theActorInTheSpotlight().wasAbleTo(RegistrationUser.testData());
    }

    @Then("^verify that the registration is complete$")
    public void verifyThatTheRegistrationIsComplete() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Check_record_register.toThe()));
    }



}
