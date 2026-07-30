package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static WebDriver getDriver() {
        return driver.get();
    }




    @Before
    public void setUp() {
        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    @After
    public void tearDown() {

        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
