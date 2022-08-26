package cydeo.com.step_definitions;

import cydeo.com.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC02TaskStepDefs {

    LoginPage loginPage= new LoginPage();

    @Given("user is on HelpDesk Page")
    public void user_is_on_help_desk_page() {
        loginPage.openWebSiteAndLogIn();
    }
    @When("user clicks on Task module")
    public void user_clicks_on_task_module() {

    }
    @When("User enters info for ToDo Title and descriptions")
    public void user_enters_info_for_to_do_title_and_descriptions() {

    }
    @When("then user selects deadline for TODO")
    public void then_user_selects_deadline_for_todo() {

    }
    @Then("user should be able to see that task has been created")
    public void user_should_be_able_to_see_that_task_has_been_created() {

    }
}
