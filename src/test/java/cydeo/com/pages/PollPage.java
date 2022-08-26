package cydeo.com.pages;

import cydeo.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollPage extends HomePage{

    //Hanna's first comandpus

    @FindBy (id = "feed-add-post-form-tab-vote")
    public WebElement pollButton;

    @FindBy (id = "question_0")
    public WebElement questionField;

    @FindBy (id = "answer_0__0_")
    public WebElement answerOneField;

    @FindBy (id = "answer_0__1_")
    public WebElement answerTwoField;

    @FindBy (id = "blog-submit-button-save")
    public WebElement saveButton;

    @FindBy (xpath = "//span[@class=\"feed-add-info-text\"]")
    public WebElement pollTitleErrorMessage;
}
