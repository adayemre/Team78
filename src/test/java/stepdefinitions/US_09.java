package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.Driver;

public class US_09 {
    WebDriver driver;
    SignInPage signInPage=new SignInPage();
    StaffFunctions staffFunctions =new StaffFunctions();
    SignOut signOut=new SignOut();
    AdminFunctions adminFunctions =new AdminFunctions();
    CreateOrEditAPatient createOrEditAPatient=new CreateOrEditAPatient();
    Faker faker=new Faker();
    @Given("Go to medunna.com homepage")
    public void go_to_medunna_com_homepage() {

        Driver.getDriver().get("https://www.medunna.com");
    }

    @When("User signs in as Staff")
    public void user_signs_in_as_staff() {
        Driver.waitAndClick(signInPage.signInDropdown);
        Driver.waitAndClick(signInPage.signInButton);
        Driver.waitAndClick(signInPage.usernameBox);
        signInPage.usernameBox.sendKeys("staffrecep");
        Driver.waitAndClick(signInPage.passwordBox);
        signInPage.passwordBox.sendKeys("123Recep");
        Driver.waitAndClick(signInPage.signinConfirm);
    }

    @Then("click on MY PAGES dropdown")
    public void click_on_my_pages_dropdown() {
      Driver.waitAndClick(staffFunctions.myPagesDropdown);
    }

    @Then("click on Search Patient button")
    public void click_on_search_patient_button() {
        Driver.waitAndClick(staffFunctions.searchPatientButton);
    }

    @Then("click on View button on patient info")
    public void click_on_view_button_on_patient_info() {
        Driver.waitAndClick(staffFunctions.viewButton);
    }

    @Then("verify patient informations are visable")
    public void verify_patient_informations_are_visable() {
        Assert.assertTrue(staffFunctions.patientId.isDisplayed());
    }

    @Then("sign out")
    public void sign_out() {
      Driver.waitAndClick(signOut.signInDropdown);
      Driver.waitAndClick(signOut.signOutButton);
    }

    @Then("User signs in as Admin")
    public void user_signs_in_as_admin() {
        Driver.waitAndClick(signInPage.signInDropdown);
        Driver.waitAndClick(signInPage.signInButton);
        Driver.waitAndClick(signInPage.usernameBox);
        signInPage.usernameBox.sendKeys("adminrecep");
        Driver.waitAndClick(signInPage.passwordBox);
        signInPage.passwordBox.sendKeys("123Recep");
        Driver.waitAndClick(signInPage.signinConfirm);
    }

    @Then("click on Items&Titiles dropdown")
    public void click_on_items_titiles_dropdown() {
        Driver.waitAndClick(adminFunctions.itemsAndTitlesDropdown);
    }

    @Then("click on Patients")
    public void click_on_patients() {
       Driver.waitAndClick(adminFunctions.patientOption);
    }


    @Then("click on edit button on patient info")
    public void click_on_edit_button_on_patient_info() {
        Driver.waitAndClick(adminFunctions.editButton);
    }

    @Then("edit the patient informations and click on save button")
    public void edit_the_patient_informations_and_click_on_save_button() {
    createOrEditAPatient.firstNameBox.sendKeys(faker.name().firstName());
    createOrEditAPatient.lastNameBox.sendKeys(faker.name().lastName());
    //createOrEditAPatient.birthDateBox.sendKeys(faker.date().birthday().toString());
    createOrEditAPatient.eMailBox.clear();
    createOrEditAPatient.eMailBox.sendKeys(faker.internet().emailAddress());
    createOrEditAPatient.phoneNumberBox.clear();
    createOrEditAPatient.phoneNumberBox.sendKeys("1111111111");
    Select selectGender=new Select(createOrEditAPatient.genderDropDown);
    selectGender.selectByIndex(0);
    Select selectBlood=new Select(createOrEditAPatient.bloodGroupDropDown);
    selectBlood.selectByIndex(1);
    createOrEditAPatient.addressBox.sendKeys(faker.address().fullAddress());
    createOrEditAPatient.descriptionBox.sendKeys("Sick");
    Select user=new Select(createOrEditAPatient.userPatientDropDown);
    user.selectByIndex(0);
    Select country=new Select(createOrEditAPatient.countryDropDown);
    country.selectByIndex(1);
   // createOrEditAPatient.stateDropDown.click();
    Select state=new Select(createOrEditAPatient.stateDropDown);
   // state.selectByIndex(1);
 //   createOrEditAPatient.saveButton.click();





    }

    @Then("verify patient informations are updated")
    public void verify_patient_informations_are_updated() {
     //   Assert.assertTrue(createOrEditAPatient.savedPatient.isDisplayed());
    }


    @Then("enter a valid SSN ID in the Patients search box")
    public void enter_a_valid_ssn_id_in_the_patients_search_box() {
        staffFunctions.searchBox.sendKeys("319-04-4812");
    }

    @Then("verify the patient informations are  invoked")
    public void verify_the_patient_informations_are_invoked() {
        Assert.assertTrue(staffFunctions.searchList.isDisplayed());
    }


    @Then("click on Delete button on the patient you want to delete")
    public void click_on_delete_button_on_the_patient_you_want_to_delete() {
        Driver.waitAndClick(adminFunctions.deleteButton);
    }

    @Then("click on Delete button on the opening alert")
    public void click_on_delete_button_on_the_opening_alert() {
        Driver.waitAndClick(adminFunctions.confirmDelete);
    }

    @Then("verify patient is deleted")
    public void verify_patient_is_deleted() {
       //
    }

    @Then("verify Delete button is not dispalyed")
    public void verify_delete_button_is_not_dispalyed() {
        //
    }


    @Then("verify Patient Search Box is not visiable")
    public void verify_patient_search_box_is_not_visiable() {
        //
    }


}
