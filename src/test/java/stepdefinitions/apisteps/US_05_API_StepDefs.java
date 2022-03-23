package stepdefinitions.apisteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigurationReader;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US_05_API_StepDefs {
    Response response;
    Map<String,Object> expectedData;
    @When("user sets the Base Url")
    public void user_sets_the_base_url() {
        RequestSpecification spec=new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();
        spec.pathParams("1","api","2","appointments","3",23269);
    }
    @When("user sends the GET request and get the response")
    public void user_sends_the_get_request_and_get_the_response() {
        response = given().headers("Authorization", "Bearer " +generateToken(),
                        "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).when().
                get(ConfigurationReader.getProperty("appointment_endpoint"));
    }
    @When("user sets the expected data")
    public void user_sets_the_expected_data() {
        expectedData=new HashMap<>();
        expectedData.put("createdBy","mehmetuns");
    }
    @Then("user does validation")
    public void user_does_validation() {
        Map<String, String> actualData=response.as(HashMap.class);
        System.out.println(actualData.toString());
        assertEquals(expectedData.get("createdBy"),actualData.get("createdBy"));
    }


}
