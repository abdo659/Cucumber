package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private By homePageTitle = By.xpath("//span/h6");
    public String getHomePageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(homePageTitle)
        ).getText();
    }
    public HomePage assertHomePageTitle() {
        Assert.assertEquals("Dashboard", getHomePageTitle());

        return this;
    }
}
