package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }
    private By LoginTitle = By.tagName("h5");
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By LoginButton = By.tagName("button");

    public String getLoginTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(LoginTitle)
        ).getText();
    }
    public LoginPage assertLoginTitle() {
        Assert.assertEquals("Login", getLoginTitle());
        return this;
    }
    public LoginPage enterUserName(String username){
        driver.findElement(usernameField).sendKeys(username);
        return this;
    }
    public LoginPage enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }
    public LoginPage clickLoginButton(){
        driver.findElement(LoginButton).click();
        return this;
    }
}
