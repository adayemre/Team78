package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class SignInPage {

    public SignInPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='username']")
    public  WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    public  WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public  WebElement signIn;

    @FindBy(xpath = "(//div[@role='alert'])[1]")
    public WebElement failedMessagePopup;

    @FindBy(xpath = "//*[.='Administration']")
    public WebElement administration;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "(//*[text()='Sign in'])[2]")
    public WebElement signInText;

    @FindBy(xpath = "//*[text()='Remember me']")
    public WebElement rememberMeText;

    @FindBy(xpath = "//*[@href='/account/reset/request']")
    public WebElement didYouForgetYourPasswordLink;

    @FindBy(xpath = "//*[text()='Reset your password']")
    public WebElement resetYourPasswordText;

    @FindBy(xpath = "(//*[@href='/account/register'])[2]")
    public WebElement registerANewAccountLink;

    @FindBy(xpath = "//*[text()='Registration']")
    public WebElement registrationText;















}
