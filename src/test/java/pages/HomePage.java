package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//li[@id='account-menu']")
    public static WebElement accountMenu;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public static WebElement signIn;

    @FindBy (xpath = "//input[@name='appoDate']")
    public WebElement appoinmentDateCanNotBePastMessage;

    @FindBy(id = "appoDate")
    public WebElement dateBox;

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement makeAppointmentButton;






}
