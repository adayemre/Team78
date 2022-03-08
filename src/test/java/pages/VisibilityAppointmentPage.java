package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisibilityAppointmentPage {

    public VisibilityAppointmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id="entity-menu")
    public WebElement mypages;

    @FindBy (xpath="//a[@class='dropdown-item'][1]")
    public WebElement myappointment;

    @FindBy(xpath = "//table[@class='table']/tbody/tr/td")
    public WebElement id;

    @FindBy(xpath = "//table[@class='table']/tbody/tr/td[2]")
    public WebElement Start;

    @FindBy(xpath = "//table[@class='table']/tbody/tr/td[3]")
    public WebElement End;

    @FindBy(xpath = "//table[@class='table']/tbody/tr/td[4]")
    public WebElement Status;

    @FindBy(xpath = "//a[@href='/physician-detail/10506']")
    public WebElement Physician;

    @FindBy(xpath = "//a[@href='/patient-detail/3356']")
    public WebElement Patient;

}
