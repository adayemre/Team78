package stepdefinitions.api_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Registrant;
import com.fasterxml.jackson.databind.ObjectMapper;
import utilities.ConfigurationReader;

import java.io.IOException;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.WriteToTxt.saveRegistrantDataApi;

public class US01ApiRegistrantStepDefs {

    Registrant registrant=new Registrant();
    Faker faker=new Faker();
    Response response;


    @Given("user sets the necessary path params")
    public void user_sets_the_necessary_path_params() {
        spec.pathParams("first","api","second","register");
    }

    @Given("user sets the expected data {string} {string} {string} {string} {string} {string} {string}")
    public void user_sets_the_expected_data(String firstname, String lastname, String ssn, String email, String username, String password, String lan) {
        firstname=faker.name().firstName();
        lastname=faker.name().lastName();
        ssn=faker.idNumber().ssnValid();
        email=faker.internet().emailAddress();
        username=faker.name().username();
        password=faker.internet().password(8,15,true,true);

        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);
        registrant.setSsn(ssn);
        registrant.setEmail(email);
        registrant.setLogin(username);
        registrant.setPassword(password);
        registrant.setLangKey(lan);

    }

    @Given("user sends the POST request and gets the response")
    public void user_sends_the_post_request_and_gets_the_response() {
        response=given().spec(spec).contentType(ContentType.JSON).body(registrant).when().post("/{first}/{second}");
    }

    @Given("user saves the api records to correspondent files")
    public void user_saves_the_api_records_to_correspondent_files() {
        saveRegistrantDataApi(registrant);
    }

    @Then("user validates api records")
    public void user_validates_api_records() throws Exception {
        response.then().statusCode(201);
        //response.prettyPrint();

        ObjectMapper obj=new ObjectMapper();
        Registrant actualRegistrant=obj.readValue(response.asString(),Registrant.class);

        //or we can use as() method from Gson like this:
        //Registrant actualRegistrant2=response.as(Registrant.class);

        System.out.println(actualRegistrant);

        assertEquals(registrant.getFirstName(),actualRegistrant.getFirstName());
        assertEquals(registrant.getLastName(),actualRegistrant.getLastName());
        assertEquals(registrant.getSsn(),actualRegistrant.getSsn());

    }




    String endpoint;

    @Given("user sets the endpoint to get user info with {string}")
    public void user_sets_the_endpoint_to_get_user_info_with(String ssn) {
        endpoint="https://medunna.com/api/user?ssn="+ssn;
    }

    @Given("user sets the expected data as {string} {string} {string} {string} {string} {string}")
    public void user_sets_the_expected_data_as(String firstname, String lastname, String ssn, String email, String username, String password) {
        registrant.setFirstName(firstname);
        registrant.setLastName(lastname);
        registrant.setSsn(ssn);
        registrant.setEmail(email);
        registrant.setLogin(username);
        registrant.setPassword(password);
    }


    @Given("user makes a GET request and gets the response")
    public void user_makes_a_get_request_and_gets_the_response() {
        response=given().headers("Authorization",
                "Bearer "+ ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).
                when().get(endpoint);
    }

    @Then("user validates registrant information using api")
    public void user_validates_registrant_information_using_api() throws IOException {
        response.then().statusCode(200);
        //response.prettyPrint();

        ObjectMapper obj=new ObjectMapper();
        Registrant actualRegistrant=obj.readValue(response.asString(),Registrant.class);

//        System.out.println(registrant.getFirstName());
//        System.out.println(actualRegistrant.getFirstName());

        assertEquals(registrant.getFirstName(),actualRegistrant.getFirstName());
        assertEquals(registrant.getLastName(),actualRegistrant.getLastName());
        assertEquals(registrant.getSsn(),actualRegistrant.getSsn());
        assertEquals(registrant.getLogin(),actualRegistrant.getLogin());
        assertEquals(registrant.getEmail(),actualRegistrant.getEmail());
    }



}
