package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.SignInPage;
import utilities.ConfigurationReader;
import utilities.DBUtils;
import utilities.Driver;

public class Us_004_StepDef {

    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));

    }

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {

        Driver.waitAndClick(homePage.accountMenu);
        Driver.waitAndClick(homePage.signIn);

    }

    @Then("Verify if user is on the sign in page")
    public void verify_if_user_is_on_the_sign_in_page() {

        Driver.wait(2);
        Assert.assertTrue(signInPage.signInText.isDisplayed());

    }

    @Given("User provides valid {string} and {string}")
    public void user_provides_valid_and(String username, String password) {

        Driver.waitAndSendText(signInPage.userName,username);
        Driver.waitAndSendText(signInPage.password,password);

    }

    @Given("User click Sign in button")
    public void user_click_sign_in_button() {

        Driver.waitAndClick(signInPage.signIn);

    }

    @Then("Verify login is success")
    public void verify_login_is_success() {
        Driver.wait(2);
        Assert.assertTrue(signInPage.administration.isDisplayed());

    }

    @Given("User provides valid {string} and invalid {string}")
    public void user_provides_valid_and_invalid(String username, String password) {

        Driver.waitAndSendText(signInPage.userName,username);
        Driver.waitAndSendText(signInPage.password,password);

    }

    @Then("Verify unsuccessful message")
    public void verify_unsuccessful_message() throws InterruptedException {

        Driver.wait(2);
        String failedMessageText = signInPage.failedMessagePopup.getText();
        Assert.assertEquals("Authentication information not correct.","Authentication information not correct.");

    }

    @When("User click on cancel button")
    public void user_click_on_cancel_button() {

        Driver.waitAndClick(signInPage.cancelButton);

    }

    @Then("Verify the if cancel button is enable")
    public void verify_the_if_cancel_button_is_enable() {

        Driver.wait(2);
    Assert.assertTrue(homePage.accountMenu.isDisplayed());

    }

    @Then("Close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @Then("Verify if there is remember me option")
    public void verify_if_there_is_remember_me_option() {

        Driver.wait(2);
        Assert.assertTrue(signInPage.rememberMeText.isDisplayed());

    }

    @When("Click on Did you forget your password? option")
    public void click_on_did_you_forget_your_password_option() {

        Driver.clickWithJS(signInPage.didYouForgetYourPasswordLink);
    }


    @Then("Verify if the option is working properly")
    public void verify_if_the_option_is_working_properly() {

        Driver.wait(2);
        Assert.assertEquals("Reset your password",signInPage.resetYourPasswordText.getText());

    }

    @When("Click on Register a new account option")
    public void click_on_register_a_new_account_option() {

        Driver.clickWithJS(signInPage.registerANewAccountLink);

    }

    @Then("Then Verify if the option2 is working properly")
    public void then_verify_if_the_option2_is_working_properly() {

        Driver.wait(2);
        Assert.assertEquals("Registration",signInPage.registrationText.getText());

    }







}
