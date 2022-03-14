package stepdefinitions;

import Pages.US015_Create_Edit_Patient;
import io.cucumber.java.en.When;
import utilities.Driver;

public class US015_Create_Edit_Patient_Steps {

    US015_Create_Edit_Patient pageObject = new US015_Create_Edit_Patient();

    @When("user clicks ItemsTitles menu")
    public void user_clicks_items_titles_menu() {
        Driver.waitAndClick(pageObject.itemsTitlesMenu,2);
    }

    @When("user clicks Patient menu")
    public void user_clicks_patient_menu() {
        Driver.waitAndClick(pageObject.patientMenuInItems,2);
    }

    @When("user verifies create_a_new_patient button")
    public void user_verifies_create_a_new_patient_button() {

    }
}
