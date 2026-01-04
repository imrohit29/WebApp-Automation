package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class LoginTest {
    WebDriver driver;
    ConfigReader config = new ConfigReader();

    @Test
    public void loginTest() {
        driver = DriverFactory.initDriver(config.get("browser"));
        driver.get(config.get("url"));

        LoginPage login = new LoginPage(driver);
        login.login(config.get("username"), config.get("password"));

        Assert.assertTrue(driver.getTitle().contains("Dashboard"), "Login failed!");
        driver.quit();
    }
}
