package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.SignInPage;
import pages.VisibilityAppointmentPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class VisibilityAppointmentSteps {
    
    HomePage homePage =new HomePage();
    SignInPage signInPage=new SignInPage();
    VisibilityAppointmentPage visibilityAppointmentPage=new VisibilityAppointmentPage();

    @Given("User on the home page")
    public void user_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @Given("User navigate on login page")
    public void user_navigate_on_login_page() {
        Driver.waitAndClick(homePage.accountMenu);
        Driver.waitAndClick(homePage.signIn);
    }
    @And("User enters valid {string} and {string}")
    public void userEntersValidAnd(String username, String password) {
        signInPage.username.sendKeys("doctorrecep");
        signInPage.password.sendKeys("123Recep");
    }

    @And("User clicks Sign in")
    public void userClicksSignIn() {
        Driver.waitAndClick(signInPage.signIn);
    }

    @And("User click My Pages")
    public void userClickMyPages() {
        Driver.waitAndClick(visibilityAppointmentPage.mypages);
    }

    @And("User click My Appointment")
    public void userClickMyAppointment() {
        Driver.waitAndClick(visibilityAppointmentPage.myappointment);
    }

    @And("User verifies Id")
    public void userVerifiesId() {
        Assert.assertTrue(Driver.waitForVisibility(visibilityAppointmentPage.id,3).isDisplayed());
    }
    
    @And("User verifies Start date")
    public void userVerifiesStartDate() {
        Assert.assertTrue(Driver.waitForVisibility(visibilityAppointmentPage.Start,3).isDisplayed());
    }
    
    @And("User verifies End date")
    public void userVerifiesEndDate() {
        Assert.assertTrue(Driver.waitForVisibility(visibilityAppointmentPage.End,3).isDisplayed());
    }

    @And("User verifies Status")
    public void userVerifiesStatus() {
        Assert.assertTrue(Driver.waitForVisibility(visibilityAppointmentPage.Status,3).isDisplayed());
    }

    @And("User verifies Physician")
    public void userVerifiesPhysician() {
        Assert.assertTrue(Driver.waitForVisibility(visibilityAppointmentPage.Physician,3).isDisplayed());
    }

    @And("User verifies Patient")
    public void userVerifiesPatient() {
        Assert.assertTrue(Driver.waitForVisibility(visibilityAppointmentPage.Patient,3).isDisplayed());
    }
}
