package cydeo.com.step_definitions;

import cydeo.com.pages.LoginPage;
import cydeo.com.pages.PollPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC01PollFunctionality {

    //Hanna's first comandpus

    PollPage pollPage = new PollPage();

    @Given("user logged in as Helpdesk")
    public void user_logged_in_as_helpdesk() {
        LoginPage loginPage = new LoginPage();
        loginPage.openWebSiteAndLogIn();
    }

    @When("user navigates to pool")
    public void user_navigates_to_pool() {
        pollPage.pollButton.click();
    }

    @When("user Adds question")
    public void user_adds_question() {
        pollPage.questionField.sendKeys("When?");
    }

    @When("user adds {int} possible answers")
    public void user_adds_possible_answers(Integer int1) {
        pollPage.answerOneField.sendKeys("Never");
        pollPage.answerTwoField.sendKeys("Now");
    }

    @When("user clicks send btn")
    public void user_clicks_send_btn() {
        pollPage.saveButton.click();
    }

    @Then("user should see \"\"The message title is not specified\"\" error msg\"")
    public void user_should_see_the_message_title_is_not_specified_error_msg() {
        Assert.assertEquals("The message title is not specified", pollPage.pollTitleErrorMessage.getText());
    }
}
