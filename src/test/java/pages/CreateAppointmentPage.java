package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateAppointmentPage {

    public CreateAppointmentPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement itemsTitles;

    @FindBy (xpath = "//a[@class='dropdown-item'][4]")
    public WebElement appointment1;

    @FindBy (id="jh-create-entity")
    public WebElement CreateANewAppointment;

    @FindBy (xpath = "//input[@name='startDate']")
    public WebElement startDate;

    @FindBy (xpath = "//input[@name='endDate']")
    public WebElement enddate;

    @FindBy (xpath = "//select[@name='status']")
    public WebElement status;

    @FindBy (id="appointment-anamnesis")
    public WebElement anamnesis;

    @FindBy (xpath = "//*[@name='treatment']")
    public WebElement treatment;

    @FindBy (xpath = "//*[@name='diagnosis']")
    public WebElement diagnosis;

    @FindBy (xpath = "//*[@name='prescription']")
    public WebElement prescription;

    @FindBy (id = "appointment-description")
    public WebElement description;

    @FindBy (id = "appointment-physician")
    public WebElement physicianid;

    @FindBy (id = "appointment-patient")
    public WebElement patientid;

    @FindBy (id = "save-entity")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='A new Appointment is created with identifier']")
    public WebElement successMessageToastContainer;

}
