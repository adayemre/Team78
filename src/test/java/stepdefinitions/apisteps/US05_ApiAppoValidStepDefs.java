package stepdefinitions.apisteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pages.US05_AppointmentPage;
import stepdefinitions.uisteps.US05_AppStepDefs;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US05_ApiAppoValidStepDefs {

    US05_AppStepDefs variables=new US05_AppStepDefs();
    Response response;
    Map<String,Object> expectedData;


    @When("user sets the base Url")
    public void userSetsTheBaseUrl() {
        RequestSpecification spec=new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();
        spec.pathParams("1","api","2","appointments","3",variables.Id);
    }

    @And("send the Get request and get the response")
    public void sendTheGetRequestAndGetTheResponse() {
        String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzdGFmZm8iLCJhdXRoIjoiUk9MRV9TVEFGRiIsImV4cCI6MTY0OTU5MTYxNX0._r3Ck-12EKUxKvk6SZrUNzXH3t1tRW25IuFaqSE_LYnb0tmwabcAA4R0cgzhPHvDdTYV6pPGgKIii7xXyR6L4Q";
        response = given().headers("Authorization","Bearer" + token,
                "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).when().
                get(ConfigurationReader.getProperty("appointment_endpoint"));

    }

    @And("set the expected data")
    public void setTheExpectedData() {
        expectedData=new HashMap<>();
        expectedData.put("createdBy",variables.username);
//        expectedData.put("firstName","mehmet");
//        expectedData.put("lastName","uns");
    }

    @Then("do validation")
    public void doValidation() {
        Map<String, String> actualData=response.as(HashMap.class);
        System.out.println(actualData);

      //  Assert.assertEquals(expectedData.get("createdBy"),actualData.get("createdBy"));
//        Assert.assertTrue(actualData.containsValue("mehmet"));
//        Assert.assertTrue(actualData.containsValue("uns"));


    }
}
