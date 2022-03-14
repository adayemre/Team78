package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US015_Create_Edit_Patient {

    public US015_Create_Edit_Patient(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement itemsTitlesMenu;

    @FindBy(xpath = "//span[text()='Patient']")
    public WebElement patientMenuInItems;





}
