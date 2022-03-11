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

public class SelectStatusSteps {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    EditAppointmentPage editAppointmentPage=new EditAppointmentPage();

    @Given("user on home page")
    public void userOnHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }

    @And("user navigate to login")
    public void userNavigateToLogin() {
        Driver.waitAndClick(homePage.accountMenu);
        Driver.waitAndClick(homePage.signIn);
    }

    @Given("Users providing valid {string} and {string}")
    public void usersProvidingValidAnd(String username, String password) {
        signInPage.username.sendKeys(username);
        signInPage.password.sendKeys(password);
    }

    @And("Users clicking Sign in button")
    public void usersClickingSignInButton() {
        Driver.waitAndClick(signInPage.signIn);
    }

    @And("Users clicking on My Pages")
    public void usersClickingOnMyPages() {
        Driver.waitAndClick(editAppointmentPage.mypages);
    }

    @And("Users clicking on My Appointment")
    public void usersClickingOnMyAppointment() {
        Driver.waitAndClick(editAppointmentPage.myappointment);
    }

    @And("Users clicking Edit button")
    public void usersClickingEditButton() {
        Driver.waitAndClick(editAppointmentPage.edit);
    }

    @And("Users providing status {string}")
    public void usersProvidingStatus(String status) {
        Driver.wait(3);
        Driver.selectByValue(editAppointmentPage.status,status);
    }

    @And("Users providing anamnesis {string}")
    public void usersProvidingAnamnesis(String anamnesis) {
        Driver.wait(2);
        editAppointmentPage.anamnesis.clear();
        Driver.wait(2);
        editAppointmentPage.anamnesis.click();
        Driver.waitAndSendText(editAppointmentPage.anamnesis,anamnesis);
    }

    @And("Users providing treatment {string}")
    public void usersProvidingTreatment(String treatment) {
        Driver.wait(2);
        editAppointmentPage.treatment.clear();
        Driver.wait(2);
        editAppointmentPage.treatment.click();
        Driver.waitAndSendText(editAppointmentPage.treatment,treatment);
    }

    @And("Users providing diagnosis {string}")
    public void usersProvidingDiagnosis(String diagnosis) {
        Driver.wait(2);
        editAppointmentPage.diagnosis.clear();
        Driver.wait(2);
        editAppointmentPage.diagnosis.click();
        Driver.waitAndSendText(editAppointmentPage.diagnosis,diagnosis);
    }

    @And("Users clicking on Save")
    public void usersClickingOnSave() {
        Driver.waitAndClick(editAppointmentPage.save);
    }

    @Then("Users verifying success message {string}")
    public void usersVerifyingSuccessMessage(String arg0) {
        Driver.wait(3);
        Assert.assertTrue(Driver.waitForVisibility(editAppointmentPage.successmessage,5).isDisplayed());
    }

    @And("Users clicking Sign out button")
    public void usersClickingSignOutButton() {
        Driver.wait(3);
        Driver.waitAndClick(homePage.accountMenu);
        Driver.waitAndClick(editAppointmentPage.signout);
        Driver.wait(3);
    }
}
