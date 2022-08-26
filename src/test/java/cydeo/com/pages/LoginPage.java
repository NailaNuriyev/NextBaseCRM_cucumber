package cydeo.com.pages;

import cydeo.com.utilities.ConfigurationReader;
import cydeo.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userNameInput;

    @FindBy(css = "input[type='password']")
    public WebElement passwordInput;

    @FindBy(css = "input[type = 'submit']")
    public WebElement LoginButton;


    public void openWebSiteAndLogIn(){

        Driver.getDriver().get(ConfigurationReader.getProperty("nextb.crm.url"));

        userNameInput.sendKeys(ConfigurationReader.getProperty("login"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        LoginButton.click();


    }
}
