package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegistrationPageBT;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegistrationStepDefsBT {

    RegistrationPageBT registrationPageBT=new RegistrationPageBT();
    Faker faker=new Faker();
    String password=faker.internet().password();

    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_registration_url"));
    }
    @Given("user enters ssn number")
    public void user_enters_ssn_number() {
       registrationPageBT.ssnTextbox.sendKeys(faker.idNumber().ssnValid());
    }
    @Given("user enters firstname")
    public void user_enters_firstname() {
        registrationPageBT.firstnameTextbox.sendKeys(faker.name().firstName());
    }
    @Given("user enters lastname")
    public void user_enters_lastname() {
        registrationPageBT.lastnameTextbox.sendKeys(faker.name().lastName());
    }
    @Given("user provides username")
    public void user_provides_username() {
        registrationPageBT.usernameTextbox.sendKeys(faker.name().username());
    }
    @Given("user provides email")
    public void user_provides_email() {
        registrationPageBT.emailTextbox.sendKeys(faker.internet().emailAddress());
    }
    @Given("user provides firstPassword")
    public void user_provides_first_password() {
        registrationPageBT.firstPasswordTextbox.sendKeys(password);
    }
    @Given("user provides secondPassword")
    public void user_provides_second_password() {
        registrationPageBT.secondPasswordTextbox.sendKeys(password);
    }
    @Given("user clicks on register button")
    public void user_clicks_on_register_button() {
        Driver.waitAndClick(registrationPageBT.registerButton);
    }
    @Then("user verifies the success message as {string}")
    public void user_verifies_the_message_as(String string) {
        Driver.wait(3);
        Assert.assertEquals(string,registrationPageBT.successMessage.getText());
    }

    @Given("user enters ssn number as {string}")
    public void user_enters_ssn_number_as(String string) {
        registrationPageBT.ssnTextbox.sendKeys(string);
    }
    @Then("user verifies the error message as {string}")
    public void user_verifies_the_error_message_as(String string) {
        Assert.assertEquals(string,registrationPageBT.errorMessage.getText());
    }

    @Given("user enters firstname as {string}")
    public void user_enters_firstname_as(String string) {
        registrationPageBT.firstnameTextbox.sendKeys(string);
    }

    @Given("user enters lastname as {string}")
    public void user_enters_lastname_as(String string) {
        registrationPageBT.lastnameTextbox.sendKeys(string);
    }





}
