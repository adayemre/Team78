package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigurationReader;
import utilities.Driver;

import static utilities.DatabaseUtility.createConnection;

public class Hooks {

    public static RequestSpecification spec;

    @Before
    public void setUp(){

    }

    @Before(order = 1, value = "@UIRegistration")
    public void navigateToRegistrationPage(){

        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_registration_url"));

    }

    @Before(order = 1, value = "@Appointment")
    public void navigateToAppointmentPage(){

        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_appointment_url"));

    }

    @Before(value = "@ApiRegistrant")
    public void setUpApi(){
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
    }

    @Before(value = "@ApiRegistrant2")
    public void setUpApi2(){
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
    }

    @Before(value = "@US015_CreateEditPatient")
    public void setUpUS015(){
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
    }


    @Before(value = "@EndToEnd")
    public void createNewDBConnection(){

        createConnection(ConfigurationReader.getProperty("db_credentials_url"),ConfigurationReader.getProperty("db_username"),ConfigurationReader.getProperty("db_password"));
    }



    @After
    public void tearDown(Scenario scenario){

//        if (scenario.isFailed()) {
//            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//
//            scenario.attach(screenshot, "image/png","screenshots");
//        }

        Driver.closeDriver();

    }

}