package stepdefinitions.ui_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegistrationPageBT;
import pojos.Registrant;
import utilities.Driver;

import static utilities.WriteToTxt.saveRegistrantData;

public class RegistrationStepDefsBT {

    RegistrationPageBT registrationPageBT=new RegistrationPageBT();
    Faker faker=new Faker();
    Registrant registrant=new Registrant();


    @Given("user enters ssn number")
    public void user_enters_ssn_number() {
        String ssn=faker.idNumber().ssnValid();
        registrant.setSsn(ssn);
        try {
            registrationPageBT.advancedButton.click();
            registrationPageBT.proceedButton.click();
        }catch (Exception e){

        }
        Driver.waitAndSendText(registrationPageBT.ssnTextbox,ssn);
    }

    @Given("user enters firstname")
    public void user_enters_firstname() {
        String firstname=faker.name().firstName();
        registrant.setFirstname(firstname);
        Driver.waitAndSendText(registrationPageBT.firstnameTextbox,firstname);

    }

    @Given("user enters lastname")
    public void user_enters_lastname() {
        String lastname=faker.name().lastName();
        registrant.setLastname(lastname);
        Driver.waitAndSendText(registrationPageBT.lastnameTextbox,lastname);

    }

    @Given("user provides username")
    public void user_provides_username() {
        //String username=registrant.getFirstname()+registrant.getLastname();
        String username=faker.name().username();
        registrant.setUsername(username);
        Driver.waitAndSendText(registrationPageBT.usernameTextbox,username);
    }

    @Given("user provides email")
    public void user_provides_email() {
        String email=faker.internet().emailAddress();
        registrant.setEmail(email);
        Driver.waitAndSendText(registrationPageBT.emailTextbox,email);
    }

    @Given("user provides firstPassword")
    public void user_provides_first_password() {
        String password=faker.internet().password(8,20,true,true);
        registrant.setPassword(password);
        Driver.waitAndSendText(registrationPageBT.firstPasswordTextbox,password);
    }
    @Given("user provides secondPassword")
    public void user_provides_second_password() {
        Driver.waitAndSendText(registrationPageBT.secondPasswordTextbox,registrant.getPassword());
    }

    @Given("user clicks on register button")
    public void user_clicks_on_register_button() {
        Driver.waitAndClick(registrationPageBT.registerButton);
    }
    @Then("user verifies the success message as {string}")
    public void user_verifies_the_message_as(String string) {
        Assert.assertTrue(Driver.waitForVisibility(registrationPageBT.successMessage,3).isDisplayed());
        //Assert.assertEquals(string,Driver.waitForVisibility(registrationPageBT.successMessage,3));
    }

    @Given("user enters ssn number as {string}")
    public void user_enters_ssn_number_as(String string) {
        registrant.setSsn(string);
        registrationPageBT.ssnTextbox.sendKeys(string);
    }

    @Then("user verifies the error message as {string}")
    public void user_verifies_the_error_message_as(String string) {
        Assert.assertTrue(registrationPageBT.errorMessage.getText().contains(string));
    }

    @Given("user enters firstname as {string}")
    public void user_enters_firstname_as(String string) {
        registrant.setFirstname(string);
        registrationPageBT.firstnameTextbox.sendKeys(string);
    }

    @Given("user enters lastname as {string}")
    public void user_enters_lastname_as(String string) {
        registrant.setLastname(string);
        registrationPageBT.lastnameTextbox.sendKeys(string);
    }

    @Then("user creates the records to a correspondent file")
    public void user_creates_the_records_to_a_correspondent_file() {
        saveRegistrantData(registrant);
    }










}
