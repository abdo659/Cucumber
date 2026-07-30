package steps;

import Pages.HomePage;
import Pages.LoginPage;
import base.Hooks;
import io.cucumber.java.en.*;

public class LoginStepDefinition {

    private LoginPage loginPage;
    private HomePage homePage;


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {

        loginPage = new LoginPage(Hooks.getDriver());
        homePage = new HomePage(Hooks.getDriver());
        loginPage.assertLoginTitle();
    }

    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() {
        loginPage
                .enterUserName("Admin")
                .enterPassword("admin123");
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to the home page")
    public void iShouldBeRedirectedToTheHomePage() {
        homePage.assertHomePageTitle();
    }
}