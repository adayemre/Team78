package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.EditAppointmentPage;
import pages.HomePage;
import pages.SignInPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class PrescriptionDescriptionSteps {

    HomePage homePage =new HomePage();
    SignInPage signInPage=new SignInPage();
    EditAppointmentPage editAppointmentPage = new EditAppointmentPage();

    @Given("Users on home page")
    public void usersOnHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }

    @And("Users navigate to login")
    public void usersNavigateToLogin() {
        Driver.waitAndClick(homePage.accountMenu);
        Driver.waitAndClick(homePage.signIn);
    }

    @Given("Users are providing valid {string} and {string}")
    public void usersAreProvidingValidAnd(String username, String password) {
        signInPage.username.sendKeys(username);
        signInPage.password.sendKeys(password);
    }

    @And("Users are clicking Sign in button")
    public void usersAreClickingSignInButton() {
        signInPage.signIn.click();
    }

    @And("Users are clicking on My Pages")
    public void usersAreClickingOnMyPages() {
        Driver.waitAndClick(editAppointmentPage.mypages);
    }

    @And("Users are clicking on My Appointment")
    public void usersAreClickingOnMyAppointment() {
        Driver.waitAndClick(editAppointmentPage.myappointment);
    }

    @And("Users are clicking Edit button")
    public void usersAreClickingEditButton() {
        Driver.waitAndClick(editAppointmentPage.edit);
    }

    @And("Users are providing status {string}")
    public void usersAreProvidingStatus(String status) {
        Driver.wait(3);
        Driver.selectByValue(editAppointmentPage.status,status);
    }

    @And("Users are providing anamnesis {string}")
    public void usersAreProvidingAnamnesis(String anamnesis) {
        Driver.wait(2);
        editAppointmentPage.anamnesis.clear();
        Driver.wait(2);
        editAppointmentPage.anamnesis.click();
        Driver.waitAndSendText(editAppointmentPage.anamnesis,anamnesis);
    }

    @And("Users are providing treatment {string}")
    public void usersAreProvidingTreatment(String treatment) {
        Driver.wait(2);
        editAppointmentPage.treatment.clear();
        Driver.wait(2);
        editAppointmentPage.treatment.click();
        Driver.waitAndSendText(editAppointmentPage.treatment,treatment);
    }

    @And("Users are providing diagnosis {string}")
    public void usersAreProvidingDiagnosis(String diagnosis) {
        Driver.wait(2);
        editAppointmentPage.diagnosis.clear();
        Driver.wait(2);
        editAppointmentPage.diagnosis.click();
        Driver.waitAndSendText(editAppointmentPage.diagnosis,diagnosis);
    }

    @And("Users are providing prescription {string}")
    public void usersAreProvidingPrescription(String prescription) {
        Driver.wait(2);
        editAppointmentPage.prescription.clear();
        Driver.wait(2);
        editAppointmentPage.prescription.click();
        Driver.waitAndSendText(editAppointmentPage.prescription,prescription);
    }

    @And("Users are providing description {string}")
    public void usersAreProvidingDescription(String description) {
        Driver.wait(2);
        editAppointmentPage.description.clear();
        Driver.wait(3);
        editAppointmentPage.description.click();
        Driver.waitAndSendText(editAppointmentPage.description,description);
    }

    @And("Users are clicking on Save")
    public void usersAreClickingOnSave() {
        Driver.waitAndClick(editAppointmentPage.save);
    }

    @Then("Users are verifying success message {string}")
    public void usersAreVerifyingSuccessMessage(String arg0) {
        Assert.assertTrue(Driver.waitForVisibility(editAppointmentPage.successmessage,5).isDisplayed());
    }

    @And("Users are clicking Sign out button")
    public void usersAreClickingSignOutButton() {
        Driver.wait(3);
        Driver.waitAndClick(homePage.accountMenu);
        Driver.waitAndClick(editAppointmentPage.signout);
        Driver.wait(3);
    }
}
