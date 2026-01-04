package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import utils.ConfigReader;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class SearchTest {
    WebDriver driver;
    ConfigReader config = new ConfigReader();

    @Test
    public void searchProductTest() {
        driver = DriverFactory.initDriver(config.get("browser"));
        driver.get(config.get("url"));

        HomePage home = new HomePage(driver);
        home.searchProduct("Laptop");

        driver.quit();
    }
}
