package stepdefinitions.apisteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.Registrant;
import utilities.ConfigurationReader;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.ApiUtils.getRequest;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Registrant;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static utilities.AU.getRequest;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveRegistrantData;
import static Hooks.Hooks.spec;
public class RegistrantApiSteps  {

    Registrant registrant = new Registrant();
    Faker faker = new Faker();
    Response response;

    Registrant registrantsList [];
    Registrant []registrants;

    @Given("user sets the necessary path params")
    public void user_sets_the_necessary_path_params() {

        spec.pathParams("first", "api", "second", "register");

    }
    @Given("user sets the expected data {string}, {string} {string} {string} {string} {string} and {string}")
    public void user_sets_the_expected_data_and(String firstname, String lastname, String ssn, String email, String username, String password, String lan) {

        firstname = faker.name().firstName();
        lastname = faker.name().lastName();
        ssn = faker.idNumber().ssnValid();
        email = faker.internet().emailAddress();
        username = faker.name().username();
        password = faker.internet().password(8, 15, true, true);

        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);
        registrant.setSsn(ssn);
        registrant.setEmail(email);
        registrant.setLogin(username);
        registrant.setPassword(password);
        registrant.setLangKey(lan);

//        Map<String ,Object> expectedData = new HashMap<>();
//        expectedData.put("firstName", firstname);

    }
    @Given("user sends the POST request and gets the response")
    public void user_sends_the_post_request_and_gets_the_response() {
        response = given().spec(spec).contentType(ContentType.JSON).body(registrant).when().post("/{first}/{second}");
    }
    @When("user saves the api records to correspondent files")
    public void user_saves_the_api_records_to_correspondent_files() {
        saveRegistrantData(registrant);
    }

    @Then("user validates api records")
    public void user_validates_api_records() throws  Exception{
        response.then().statusCode(201);
        response.prettyPrint();

        ObjectMapper obj = new ObjectMapper();
  
        Registrant actualRegistrant = obj.readValue(response.asString(), Registrant.class);

        System.out.println(actualRegistrant);

        assertEquals(registrant.getFirstName(), actualRegistrant.getFirstName());
        assertEquals(registrant.getLastName(), actualRegistrant.getLastName());
        assertEquals(registrant.getSsn(), actualRegistrant.getSsn());


    }


    @Given("user sends the get request for users data")
    public void user_sends_the_get_request_for_users_data() {

        response =  getRequest(generateToken(),ConfigurationReader.getProperty("registrant_endpoint"));
        //    response.prettyPrint();

    }
    @Given("user deserializes data to Java")
    public void user_deserializes_data_to_java() throws Exception{
        // WAys of de-serialization
        // Object Mapper

        ObjectMapper obj = new ObjectMapper();

        registrants = obj.readValue(response.asString(), Registrant[].class);
        System.out.println("registrants.length = " + registrants.length);
        for (int i=0; i<registrants.length;i++){
            System.out.println( registrants[i].getEmail());

        }


    }
    @Given("user saves the data records to correspondent files")
    public void user_saves_the_data_records_to_correspondent_files() {

    }


}