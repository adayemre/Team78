package stepdefinitions.uisteps;


import io.cucumber.java.en.Then;
import pages.US0010_PhysicianAppointmentsPage;
import utilities.Driver;
import static org.junit.Assert.assertTrue;

public class US0012_NegativeTest {
    US0010_PhysicianAppointmentsPage verifyPage = new US0010_PhysicianAppointmentsPage();



    @Then("user verifies the staff's page")
    public void userVerifiesTheStaffSPage() {
        Driver.waitForVisibility(verifyPage.mypages,3).isDisplayed();
    }

    @Then("user verifies staff can't request test")
    public void userVerifiesStaffCanTRequestTest() {
        String pageSource = Driver.getDriver().getPageSource();
        boolean result = pageSource.contains("Request Test");
        assertTrue(result == false);
    }

    @Then("user verifies the admin's page")
    public void userVerifiesTheAdminSPage() {
        Driver.waitForVisibility(verifyPage.adminPages,3).isDisplayed();

    }

    @Then("user verifies admin can't request test")
    public void userVerifiesAdminCanTRequestTest() {

        Driver.waitAndClick(verifyPage.adminDropDown);
        Driver.waitAndClick(verifyPage.testItem);


        String pageSource = Driver.getDriver().getPageSource();
        boolean result = pageSource.contains("Request Test");
        assertTrue(result == false);
    }


}
