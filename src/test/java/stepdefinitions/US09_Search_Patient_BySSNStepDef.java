package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.US09_SignInPage;

public class US09_Search_Patient_BySSNStepDef {
    US09_SignInPage signInPage = new US09_SignInPage();

    @Then("user clicks SSNsearchBox")
    public void userClicksSSNsearchBox() {
        signInPage.ssnSearchBox.click();
    }

    @And("user enters SSN number")
    public void userEntersSSNNumber() {
        signInPage.ssnSearchBox.sendKeys("100-45-2345");
    }

    @Then("user verifies related Patience page")
    public void userVerifiesRelatedPatiencePage() {
        signInPage.PatienceInfoPage.isDisplayed();
    }

    @Then("user gets patience id")
    public void userGetsPatienceId() {

        String id = signInPage.PatientId.getText();

        System.out.println(signInPage.PatientId);


    }

    @And("user saves the users data to correspondent files")
    public void userSavesTheUsersDataToCorrespondentFiles() {
    }
}
