package steps;

import Pages.HomePage;
import Pages.LoginPage;
import base.Hooks;
import io.cucumber.java.en.*;

import java.util.Map;

import static Commons.ReadFromDataFiles.readData;

public class LoginStepDefinition {

    private LoginPage loginPage;
    private HomePage homePage;
    private String username ;
    private String password ;


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() throws Exception {

        loginPage = new LoginPage(Hooks.getDriver());
        homePage = new HomePage(Hooks.getDriver());
        Map<String, String> loginData = readData("LoginData.json");
        username = loginData.get("username");
        password = loginData.get("password");
        loginPage.assertLoginTitle();
    }

    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() {
        loginPage
                .enterUserName(username)
                .enterPassword(password);
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