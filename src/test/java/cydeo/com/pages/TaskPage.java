package cydeo.com.pages;

import cydeo.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement TaskButton;

    @FindBy(name = "ACTION[0][ARGUMENTS][data][TITLE]")
    public WebElement ToDoInput;

    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[2]")
    public WebElement bodyFrame;

    @FindBy(xpath = "//body[@style='min-height: 84px;']" )
    public WebElement ToDoDescription;

    @FindBy(xpath = "(//input[@class='task-options-inp'])[1]")
    public WebElement dateButton;

    @FindBy(xpath = "//a[@data-date='1661817600000']")
    public WebElement selectDate;

    @FindBy(xpath = "//span[.='Select']")
    public WebElement selectButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//div[.='Task has been created']")
    public WebElement textDisplayed;

    public void switchFrame(){

        Driver.getDriver().switchTo().frame(bodyFrame);
        ToDoDescription.sendKeys("arm and chest works outs");
        Driver.getDriver().switchTo().defaultContent();




    }

}
