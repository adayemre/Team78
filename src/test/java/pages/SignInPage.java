package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {

    public SignInPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    public  WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public  WebElement signIn;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "(//*[text()='Sign in'])[2]")
    public WebElement signInText;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy (xpath = "(//*[@href='#appointment'])[1]")
    public WebElement makeAnAppoinment;
}
