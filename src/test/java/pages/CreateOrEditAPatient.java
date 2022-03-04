package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrEditAPatient {
    public CreateOrEditAPatient(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='patient-firstName']")
    public WebElement firstNameBox;
    @FindBy(xpath = "//*[@id='patient-lastName']")
    public WebElement lastNameBox;
    @FindBy(xpath = "//*[@id='patient-birthDate']")
    public WebElement birthDateBox;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement eMailBox;
    @FindBy(xpath = "//*[@id='patient-phone']")
    public WebElement phoneNumberBox;
    @FindBy(xpath = "//*[@id='patient-gender']")
    public WebElement genderDropDown;
    @FindBy(xpath = "//*[@id='patient-bloodGroup']")
    public WebElement bloodGroupDropDown;
    @FindBy(xpath = "//*[@id='patient-adress']")
    public WebElement addressBox;
    @FindBy(xpath = "//*[@id='patient-description']")
    public WebElement descriptionBox;
    @FindBy(xpath = "//*[@id='patient-user']")
    public WebElement userPatientDropDown;
    @FindBy(xpath = "//*[@id='patient-country']")
    public WebElement countryDropDown;
    @FindBy(id = "patient-cstate")
    public WebElement stateDropDown;
    @FindBy(linkText = "save")
    public WebElement saveButton;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/h2/span")
    public WebElement savedPatient;
   // @FindBy(className = "Toastify__toast-container Toastify__toast-container--top-left toastify-container")
   // public WebElement saveSuccesAlert;



}
