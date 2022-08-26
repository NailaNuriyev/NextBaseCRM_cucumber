package cydeo.com.step_definitions;

import cydeo.com.pages.LoginPage;
import cydeo.com.pages.TaskPage;
import cydeo.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class TC02TaskStepDefs {

    LoginPage loginPage= new LoginPage();
    TaskPage taskPage = new TaskPage();

    @Given("user is on HelpDesk Page")
    public void user_is_on_help_desk_page() {
        loginPage.openWebSiteAndLogIn();
    }
    @When("user clicks on Task module")
    public void user_clicks_on_task_module() {
        taskPage.TaskButton.click();

    }
    @When("User enters info for ToDo Title and descriptions")
    public void user_enters_info_for_to_do_title_and_descriptions() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        taskPage.ToDoInput.sendKeys("GYM");
        taskPage.switchFrame();

    }
    @When("then user selects deadline for TODO")
    public void then_user_selects_deadline_for_todo() {
        taskPage.dateButton.click();
        taskPage.selectDate.click();
        taskPage.selectButton.click();

    }
    @Then("user should be able to see that task has been created")
    public void user_should_be_able_to_see_that_task_has_been_created() {
        taskPage.sendButton.click();

        Assert.assertEquals("Task has been created",taskPage.textDisplayed.getText());


    }
}
