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

public class TypingRequiredFields {

    HomePage homePage =new HomePage();
    SignInPage signInPage=new SignInPage();
    EditAppointmentPage editAppointmentPage = new EditAppointmentPage();

    @Given("User on home page")
    public void userOnHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }

    @And("User navigate to login")
    public void userNavigateToLogin() {
        Driver.waitAndClick(homePage.accountMenu);
        Driver.waitAndClick(homePage.signIn);
    }

    @Given("User is providing valid {string} and {string}")
    public void userIsProvidingValidAnd(String username, String password) {
        signInPage.username.sendKeys(username);
        signInPage.password.sendKeys(password);
    }

    @And("User is clicking Sign in button")
    public void userIsClickingSignInButton() {
        Driver.waitAndClick(signInPage.signIn);
    }

    @And("User is clicking on My Pages")
    public void userIsClickingOnMyPages() {
        Driver.waitAndClick(editAppointmentPage.mypages);
    }

    @And("User is clicking on My Appointment")
    public void userIsClickingOnMyAppointment() {
        Driver.waitAndClick(editAppointmentPage.myappointment);
    }

    @And("User is clicking Edit button")
    public void userIsClickingEditButton() {
        Driver.waitAndClick(editAppointmentPage.edit);
    }

    @And("user is providing status {string}")
    public void userIsProvidingStatus(String status) {
        Driver.wait(3);
        Driver.selectByValue(editAppointmentPage.status,status);
    }

    @And("user is providing anamnesis {string}")
    public void userIsProvidingAnamnesis(String anamnesis) {
        Driver.wait(2);
        editAppointmentPage.anamnesis.clear();
        Driver.wait(2);
        editAppointmentPage.anamnesis.click();
        Driver.waitAndSendText(editAppointmentPage.anamnesis,anamnesis);
    }

    @And("user is providing treatment {string}")
    public void userIsProvidingTreatment(String treatment) {
        Driver.wait(2);
        editAppointmentPage.treatment.clear();
        Driver.wait(2);
        editAppointmentPage.treatment.click();
        Driver.waitAndSendText(editAppointmentPage.treatment,treatment);
    }

    @And("user is providing diagnosis {string}")
    public void userIsProvidingDiagnosis(String diagnosis) {
        Driver.wait(2);
        editAppointmentPage.diagnosis.clear();
        Driver.wait(2);
        editAppointmentPage.diagnosis.click();
        Driver.waitAndSendText(editAppointmentPage.diagnosis,diagnosis);
    }

    @And("User is clicking on Save")
    public void userIsClickingOnSave() {
        Driver.waitAndClick(editAppointmentPage.save);
    }
//
//    @Then("User is verifying success message {string}")
//    public void userIsVerifyingSuccessMessage(String arg0) {
//        Assert.assertTrue(Driver.waitForVisibility(editAppointmentPage.successmessage,5).isDisplayed());
//    }
//
//    @And("User is clicking Sign out button")
//    public void userIsClickingSignOutButton() {
//        Driver.wait(3);
//        Driver.waitAndClick(homePage.accountMenu);
//        Driver.waitAndClick(editAppointmentPage.signout);
//    }
}
