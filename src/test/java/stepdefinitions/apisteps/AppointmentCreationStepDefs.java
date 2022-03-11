package stepdefinitions.apisteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.AppoinmentInnest;
import pojos.Appointment;
import pojos.AppointmentMiddle;
import pojos.AppointmentOuter;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertEquals;
import static utilities.ApiUtils.getRequest;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveAppointmentCreation;

public class AppointmentCreationStepDefs {


    AppointmentMiddle appointmentCreationAPI = new AppointmentMiddle();
    Response response;
    //    AppointmentMiddle appointmentList [];
    AppointmentOuter appointmentOuterList[];


    @Given("user sets the necessary path params for appointment creation")
    public void user_sets_the_necessary_path_params_for_appointment_creation() {
        spec.pathParams("first", "api", "second", "appointments", "third", "request");
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

        Map<String, Object> actualData = response.as(HashMap.class);

        assertEquals(appointmentCreationAPI.getFirstName(), ((Map) actualData.get("patient")).get("firstName"));
        assertEquals(appointmentCreationAPI.getSsn(), ((Map) ((Map) actualData.get("patient")).get("user")).get("ssn"));

//        assertEquals(appointmentCreationAPI.getLastName(),actualAppointment.getPatient().getLastName());
//        assertEquals(appointmentCreationAPI.getSsn(),actualAppointment.getPatient().getUser().getSsn());

    }
    /*
    İlknurun get kodları
    @And("user sends the Get request and gets the response")
public void userSendsTheGetRequestAndGetsTheResponse() {
    response = given().headers("Authorization",
                    "Bearer " + generateToken(),
                    "Content-Type", ContentType.JSON,
                    "Accept", ContentType.JSON).when().
            get(ConfigurationReader.getProperty("physician_appointment_url"));
}
     */


    //GET REQUEST
    @Given("user sends the get request for appointments data")
    public void user_sends_the_get_request_for_appointments_data() {
        response = getRequest(generateToken(), ConfigurationReader.getProperty("appointments_endpoint"));

//        This can be used for get request
//        response = given().headers(
//                "Authorization",
//                "Bearer " + generateToken(),
//                "Content-Type",
//                ContentType.JSON,
//                "Accept",
//                ContentType.JSON).when().get(ConfigurationReader.getProperty("appointments_endpoint"));
    }


    @Given("user deserializes data to Java for appointments")
    public void user_deserializes_data_to_java_for_appointments() throws Exception {
//       response.prettyPrint();
        ObjectMapper obj = new ObjectMapper();
//        appointmentList = obj.readValue(response.asString(),AppointmentMiddle[].class);
//        System.out.println(appointmentList.length);
//        for(int i = 0; i < appointmentList.length; i++){
//            System.out.println("name" + appointmentList[i].getFirstName());
//        }
//165. ve 225. 229. appointment da sıkıntı var Null Pointer veriyor
        appointmentOuterList = obj.readValue(response.asString(), AppointmentOuter[].class);
        System.out.println(appointmentOuterList.length);
        for (int i = 0; i < appointmentOuterList.length; i++) {
            if (appointmentOuterList[i].getId() != null) {
//                continue;
//            }
            System.out.println("Id: "   + appointmentOuterList[i].getPatient());
        }
    }

}

    @Given("user saves the users data to correspondent files for appointments")
    public void user_saves_the_users_data_to_correspondent_files_for_appointments() {
        response.then().body("id",hasItem(18222));
//        response.then().body("id",hasItem(20734));

    }


// AppointmentMiddle appointmentMiddle = new AppointmentMiddle();
//  AppoinmentInnest innest = new AppoinmentInnest();

//    @Given("user sets the necessary path params for appointment creation")
//    public void user_sets_the_necessary_path_params_for_appointment_creation() {
//        spec.pathParams("first","api","second","appointments","third","request");
//    }
//
//
//    @Given("user sets the expected data {string}, {string} {string} {string} {string}  and {string}")
//    public void user_sets_the_expected_data_and(String firstname, String lastname, String phone, String email, String SSN, String date) {
//        appointmentMiddle.setFirstName(firstname);
//        appointmentMiddle.setLastName(lastname);
//        appointmentMiddle.setEmail(email);
//        appointmentMiddle.setSsn(SSN);
//        appointmentMiddle.setStartDate(date);
//        appointmentMiddle.setPhone(phone);
////        appointmentMiddle.setUser(innest.g);
//    }
//
//
//    @Given("user sends the POST request and gets the response for appointment creation")
//    public void user_sends_the_post_request_and_gets_the_response_for_appointment_creation() {
//        given().spec(spec).contentType(ContentType.JSON).body(appointmentMiddle).when().post("/{first}/{second}/{third}");
//    }
//
//
//    @When("user saves the appointment records to correspondent files")
//    public void user_saves_the_appointment_records_to_correspondent_files() {
//        saveAppointmentCreation(appointmentMiddle);
//    }
//
//    @Then("user validates appointment records")
//    public void user_validates_appointment_records() {
//        response.then().statusCode(201);
//        response.prettyPrint();
//
//    }








    /*
    {
    "createdBy": "anonymousUser",
    "createdDate": "2022-03-08T08:49:25.005135Z",
    "id": 18738,
    "startDate": "2032-12-12T00:00:00Z",
    "endDate": "2032-12-12T01:00:00Z",
    "status": "UNAPPROVED",
    "anamnesis": null,
    "treatment": null,
    "diagnosis": null,
    "prescription": null,
    "description": null,
    "physician": null,
    "patient": {
        "createdBy": "anonymousUser",
        "createdDate": "2022-03-07T19:36:05.325341Z",
        "id": 18311,
        "firstName": "Patient",
        "lastName": "Tugba",
        "birthDate": null,
        "phone": "777-333-1414",
        "gender": null,
        "bloodGroup": null,
        "adress": null,
        "email": "patienttugba@gmail.com",
        "description": null,
        "user": {
            "createdBy": "anonymousUser",
            "createdDate": "2022-03-02T20:42:39.827279Z",
            "id": 12235,
            "login": "patienttugba",
            "firstName": "Patient",
            "lastName": "Tugba",
            "email": "patienttugba@gmail.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null,
            "ssn": "677-85-5486"
        },
        "inPatients": null,
        "country": null,
        "cstate": null
    },
    "ctests": [

    ]
}
     */


}
