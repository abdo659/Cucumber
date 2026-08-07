package steps;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static base.Hooks.getDriver;

public class LoginWithMultiData {

    private LoginPage loginPage;
    private HomePage homePage;

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        loginPage = new LoginPage(getDriver());
        homePage = new HomePage(getDriver());
        loginPage.assertLoginTitle();
    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {
        loginPage.enterUserName(username)
                .enterPassword(password);
    }

    @And("user click on the login button")
    public void userClickOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user should be redirected to the home page")
    public void userShouldBeRedirectedToTheHomePage() {
        homePage.assertHomePageTitle();
    }
}