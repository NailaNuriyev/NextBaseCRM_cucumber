package cydeo.com.step_definitions;

import cydeo.com.pages.LoginPage;
import cydeo.com.utilities.ConfigurationReader;
import cydeo.com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepsDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user am on NextBaseCRM Login page")
    public void user_am_on_next_base_crm_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextb.crm.url"));
    }
    @When("user enter help desk user name")
    public void user_enter_help_desk_user_name() {
        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("login"));

    }
    @When("user enter help desk pass word")
    public void user_enter_help_desk_pass_word() {

        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));

    }
    @When("user click login button")
    public void user_click_login_button() {
        loginPage.LoginButton.click();

    }
    @Then("user should see Activity Stream")
    public void user_should_see_activity_stream() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("stream"));


    }



}
