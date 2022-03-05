package stepdefinitions.uisteps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US0012_PhysicianEditRequestTestPage;
import utilities.Driver;


import static org.junit.Assert.assertTrue;


public class US0012_PhysicianEditRequestTestStepDefs {
     US0012_PhysicianEditRequestTestPage editRequestTestPage=new US0012_PhysicianEditRequestTestPage();

    @Then("user select one of the patient list and click edit button")
    public void userSelectOneOfThePatientListAndClickEditButton() {
        Driver.waitAndClick(editRequestTestPage.editButton);
    }

    @Then("user verifies the edit page")
    public void userVerifiesTheEditPage() {
        Driver.wait(3);
        assertTrue(editRequestTestPage.editPageVerify.getText().contains("Edit"));

    }

    @Then("user verifies the Request a test button is displayed")
    public void userVerifiesTheRequestATestButtonIsDisplayed() {
        assertTrue(editRequestTestPage.requestTestButton.isDisplayed());
        Driver.waitAndClick(editRequestTestPage.requestTestButton);
        Driver.wait(3);
        assertTrue(editRequestTestPage.requestTestVerify.getText().contains("Test"));
    }


    @When("user clicks Request a test button")
    public void userClicksRequestATestButton() {
        Driver.waitAndClick(editRequestTestPage.requestTestButton);
    }

    @When("clicks the some of checkmark options\\(Glucose, Urea, Creatinine, Sodium,Potassium, Total protein, Albumin, Hemoglobin)")
    public void clicksTheSomeOfCheckmarkOptionsGlucoseUreaCreatinineSodiumPotassiumTotalProteinAlbuminHemoglobin() {
         for(WebElement x: editRequestTestPage.itemsName) {
           switch (x.getText().toString()){
               case "Glucose":
                   Driver.waitAndClick(editRequestTestPage.checkmarkOptions.get(0));
                   break;
               case "Urea":
                   Driver.waitAndClick(editRequestTestPage.checkmarkOptions.get(1));
                   break;
               case "Creatinine":
                   Driver.waitAndClick(editRequestTestPage.checkmarkOptions.get(2));
                   break;
               case "Sodium":
                   Driver.waitAndClick(editRequestTestPage.checkmarkOptions.get(3));
                   break;
               case "Potassium":
                   Driver.waitAndClick(editRequestTestPage.checkmarkOptions.get(4));
                   break;
               case "Total protein":
                   Driver.waitAndClick(editRequestTestPage.checkmarkOptions.get(5));
                   break;
               case "Albumin":
                   Driver.waitAndClick(editRequestTestPage.checkmarkOptions.get(6));
                   Actions actions= new Actions(Driver.getDriver());
                   actions.keyDown(Keys.ALT).perform();
                   break;
               case "Hemoglobin":
                   Driver.waitAndClick(editRequestTestPage.checkmarkOptions.get(7));
                   break;
           }
         }
    }

    @Then("user verifies the have following items as checkmark options; \\(Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin)")
    public void userVerifiesTheHaveFollowingItemsAsCheckmarkOptionsGlucoseUreaCreatinineSodiumPotassiumTotalProteinAlbuminHemoglobin() {


       for(int i=0;i<9;i++){
          WebElement x= editRequestTestPage.checkmarkOptions.get(i);

          assertTrue(x.isEnabled());
       }

    }
}
