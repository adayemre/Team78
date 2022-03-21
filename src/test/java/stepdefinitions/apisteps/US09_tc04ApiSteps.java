package stepdefinitions.apisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pages.US09_SignInPage;
import pojos.Registrant;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.WriteToTxt.saveRegistrantData;

public class US09_tc04ApiSteps {

    US09_SignInPage signInPage=new US09_SignInPage();

    Registrant registrant = new Registrant();
    Faker faker = new Faker();
    Response responses;


    @Given("user sets the necessary path params for patient info")
    public void user_sets_the_necessary_path_params_for_patient_info() {
        spec.pathParams("first", "api", "second", "patients/{17198}");


    }


    @And("user sends the POST request and gets the response for patient")
    public void userSendsThePOSTRequestAndGetsTheResponseForPatient() {
        responses = given().spec(spec).contentType(ContentType.JSON).body(registrant).when().post("/{first}/{second}");

    }

    @When("user saves the api records to correspondent files of patient")
    public void userSavesTheApiRecordsToCorrespondentFilesOfPatient() {

        saveRegistrantData(registrant);
    }

    @Then("user validates api records of patient")
    public void userValidatesApiRecordsOfPatient() {
        responses.then().statusCode(201);
        responses.prettyPrint();
    }
}