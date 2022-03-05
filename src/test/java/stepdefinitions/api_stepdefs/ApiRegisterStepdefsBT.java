package stepdefinitions.api_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import utilities.Driver;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class ApiRegisterStepdefsBT {

        Response response;


        @Test @Given("user makes a get request using API and gets the response")
        public void user_makes_a_get_request_using_api_and_gets_the_response() {
            RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();
            Driver.wait(3);
            spec.pathParams("first","todos","second","23");
            response=given().spec(spec).when().get("/{first}/{second}");
            response.prettyPrint();
        }

        @Then("user validates registrant info in the database")
        public void user_validates_registrant_info_in_the_database() {
            //response.then().statusCode(200);
            assertEquals(200,response.getStatusCode());
        }








}
