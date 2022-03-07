package stepdefinitions.apisteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.AppointmentMiddle;
import pojos.AppointmentOuter;

import java.util.HashMap;
import java.util.Map;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.WriteToTxt.saveAppointmentCreation;

public class AppointmentCreationStepDefs {


    AppointmentMiddle appointmentCreationAPI = new AppointmentMiddle();
    Response response;


    @Given("user sets the necessary path params for appointment creation")
    public void user_sets_the_necessary_path_params_for_appointment_creation() {
        spec.pathParams("first", "api", "second", "appointments","third","request");
    }




    //   | firstname | lastname | SSN         | email                  | phone        | date     |
    @Given("user sets the expected data {string}, {string} {string} {string} {string}  and {string}")
    public void user_sets_the_expected_data_and(String firstname, String lastname, String SSN, String email, String phone, String date) {
        appointmentCreationAPI.setFirstName(firstname);
        appointmentCreationAPI.setLastName(lastname);
        appointmentCreationAPI.setSsn(SSN);
        appointmentCreationAPI.setEmail(email);
        appointmentCreationAPI.setPhone(phone);
        appointmentCreationAPI.setStartDate(date);
    }




    @Given("user sends the POST request and gets the response for appointment creation")
    public void user_sends_the_post_request_and_gets_the_response_for_appointment_creation() {
        response = given().spec(spec).contentType(ContentType.JSON).body(appointmentCreationAPI).when().post("/{first}/{second}/{third}");
    }



    @When("user saves the appointment records to correspondent files")
    public void user_saves_the_appointment_records_to_correspondent_files() {
        saveAppointmentCreation(appointmentCreationAPI);
    }


    @Then("user validates appointment records")
    public void user_validates_appointment_records() throws Exception {
        response.then().statusCode(201);
        response.prettyPrint();

//        ObjectMapper obj = new ObjectMapper();
//        AppointmentOuter actualAppointment = obj.readValue(response.asString(),AppointmentOuter.class);

//        assertEquals(appointmentCreationAPI.getFirstName(),actualAppointment.getPatient().getFirstName());
//        assertEquals(appointmentCreationAPI.getLastName(),actualAppointment.getPatient().getLastName());
//        assertEquals(appointmentCreationAPI.getSsn(),actualAppointment.getPatient().getUser().getSsn());

        Map<String,Object> actualData = response.as(HashMap.class);

        assertEquals(appointmentCreationAPI.getFirstName(),((Map)actualData.get("patient")).get("firstName"));
        assertEquals(appointmentCreationAPI.getSsn(),((Map)((Map)actualData.get("patient")).get("user")).get("ssn"));

//        assertEquals(appointmentCreationAPI.getLastName(),actualAppointment.getPatient().getLastName());
//        assertEquals(appointmentCreationAPI.getSsn(),actualAppointment.getPatient().getUser().getSsn());







    }



}
