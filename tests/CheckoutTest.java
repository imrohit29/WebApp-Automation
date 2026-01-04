package tests;

import org.testng.annotations.Test;
import pages.CheckoutPage;
import utils.ConfigReader;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class CheckoutTest {
    WebDriver driver;
    ConfigReader config = new ConfigReader();

    @Test
    public void checkoutTest() {
        driver = DriverFactory.initDriver(config.get("browser"));
        driver.get(config.get("url"));

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.proceedToCheckout();

        driver.quit();
    }
}
