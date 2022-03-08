package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CreateAppointmentPage;
import pages.HomePage;
import pages.SignInPage;
import pojos.CreateAppointment;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CreateAppointmentSteps {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    CreateAppointmentPage createAppointmentPage = new CreateAppointmentPage();
    CreateAppointment createAppointment = new CreateAppointment();
    Faker faker = new Faker();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        Driver.waitAndClick(homePage.accountMenu);
        Driver.waitAndClick(homePage.signIn);
    }
    @Given("User provides valid {string} and {string}")
    public void user_provides_valid_and(String username, String password) {
//        username=faker.name().username();
//        createAppointment.setUsername(username);
//        Driver.waitAndSendText(signInPage.userName,username);
//        password=faker.internet().password(7,9,true,true);
//        createAppointment.setPassword(password);
//        Driver.waitAndSendText(signInPage.password,password);
        signInPage.username.sendKeys(username);
        signInPage.password.sendKeys(password);
    }
    @Given("User clicks Sign in button")
    public void user_clicks_sign_in_button() {
        Driver.waitAndClick(signInPage.signIn);
    }
    @Given("User clicks on ItemsTitles")
    public void user_clicks_on_items_titles(){
        Driver.wait(3);
        createAppointmentPage.itemsTitles.click();
    }
    @Given("User clicks on an Appointment")
    public void user_clicks_on_an_appointment(){
        Driver.wait(3);
        createAppointmentPage.appointment1.click();
    }
    @Given("user clicks on Create an Appointment")
    public void user_clicks_on_create_an_appointment(){
        Driver.wait(3);
        createAppointmentPage.CreateANewAppointment.click();
    }
    @Given("user provides startdate {string}")
    public void user_provides_startdate(String startdate) {
//        createAppointment.setStartDateTime(startdate);
//        Driver.waitAndSendText(createAppointmentPage.startDate,startdate+ Keys.ENTER);
    }
    @Given("user provides enddate {string}")
    public void user_provides_enddate(String enddate) {
//        createAppointment.setEndDateTime(enddate);
//        Driver.waitAndSendText(createAppointmentPage.enddate,enddate + Keys.ENTER);
    }
    @Given("user provides status {string}")
    public void user_provides_status(String status) {
        createAppointment.setStatus(status);
        Driver.waitAndSendText(createAppointmentPage.status,status+Keys.ENTER);
    }
    @Given("user provides anamnesis {string}")
    public void user_provides_anamnesis(String anamnesis) {
        Driver.wait(3);
//        createAppointmentPage.anamnesis.sendKeys(anamnesis);
        Driver.waitAndSendText(createAppointmentPage.anamnesis,anamnesis);
    }
    @Given("user provides treatment {string}")
    public void user_provides_treatment(String treatment) {
        Driver.wait(3);
//        createAppointmentPage.treatment.sendKeys(treatment);
        Driver.waitAndSendText(createAppointmentPage.treatment,treatment);
    }
    @Given("user provides diagnosis {string}")
    public void user_provides_diagnosis(String diagnosis) {
        Driver.wait(3);
        createAppointmentPage.diagnosis.sendKeys(diagnosis);
    }
    @Given("user provides prescription {string}")
    public void user_provides_prescription(String prescription) {
        Driver.wait(3);
        createAppointmentPage.prescription.sendKeys(prescription);
    }
    @Given("user provides description {string}")
    public void user_provides_description(String description) {
        Driver.wait(3);
        createAppointmentPage.description.sendKeys(description);
    }
    @Given("user provides physician {string}")
    public void user_provides_physician(String physician) {
        Driver.wait(3);
        createAppointmentPage.physicianid.sendKeys(physician);
    }
    @Given("user provides patient {string}")
    public void user_provides_patient(String patient) {
        Driver.wait(3);
        createAppointmentPage.patientid.sendKeys(patient);
    }
    @Given("User clicks on Save")
    public void user_clicks_on_save() {
        Driver.wait(3);
        createAppointmentPage.submitButton.click();
    }
    @Then("Verifies the A new Appointment is created with identifier {string} message")
    public void verifies_the_a_new_appointment_is_created_with_identifier_message(String message) {
        Assert.assertTrue(Driver.waitForVisibility(createAppointmentPage.successMessageToastContainer,5).isDisplayed());
    }


}
