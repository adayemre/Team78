package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.SettingsPage;
import pages.SignInPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePageStepDefs {


    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    SettingsPage settingsPage = new SettingsPage();

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


    @When("User clicks on account menu")
    public void user_clicks_on_account_menu() {
        Driver.waitAndClick(homePage.accountMenu);
    }
    @When("User clicks on settings")
    public void user_clicks_on_settings() {
        Driver.waitAndClick(settingsPage.settings);
    }

    @When("User clicks on firstnamebox and clears")
    public void user_clicks_on_firstnamebox_and_clears() {
       Driver.waitAndClick(settingsPage.firstNameBox);
       Driver.wait(1);
       settingsPage.firstNameBox.clear();

    }

    @When("User updates firstname as {string}")
    public void user_updates_name_as(String firstname) {
        Driver.waitAndSendText(settingsPage.firstNameBox,firstname);
    }
    @When("User clicks on save button")
    public void user_clicks_on_save_button() {
        Driver.waitAndClick(settingsPage.saveButton);
    }
    @When("User verifies the Settings saved! message")
    public void user_verifies_the_settings_saved_message() {
        Driver.wait(3);
        Assert.assertTrue(settingsPage.settingsSavedMsg.isDisplayed());
    }

    @When("User clicks on lastnamebox and clears")
    public void user_clicks_on_lastnamebox_and_clears() {
        Driver.waitAndClick(settingsPage.lastNameBox);
        Driver.wait(1);
        settingsPage.lastNameBox.clear();
    }


    @When("User updates lastname as {string}")
    public void user_updates_lastname_as(String lastname) {
        Driver.waitAndSendText(settingsPage.lastNameBox,lastname);
    }

    @Then("Close the application")
    public void close_the_application() {
        Driver.wait(5);
        Driver.closeDriver();
    }


    @When("User clicks on emailbox and clears")
    public void user_clicks_on_emailbox_and_clears() {
        Driver.wait(3);
        settingsPage.emailBox.clear();
    }
    @When("User updates email as {string}")
    public void user_updates_email_as(String email) {
        Driver.waitAndSendText(settingsPage.emailBox,email);
    }


    @When("User verifies the Your first name is required. message")
    public void user_verifies_the_your_first_name_is_required_message() {
        Driver.wait(3);
        Assert.assertTrue(settingsPage.firstNameRequiredMessage.isEnabled());
    }


    @When("User verifies the Your last name is required. message")
    public void user_verifies_the_your_last_name_is_required_message() {
        Driver.wait(3);
        Assert.assertTrue(settingsPage.lastNameRequiredMessage.isEnabled());
    }


    @When("User verifies This field is invalid message")
    public void user_verifies_this_field_is_invalid_message() {
        Driver.wait(3);
        Assert.assertTrue(settingsPage.thisFieldInvalidMsgForEmail.isEnabled());
    }




}
