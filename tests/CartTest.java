package tests;

import org.testng.annotations.Test;
import pages.CartPage;
import utils.ConfigReader;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class CartTest {
    WebDriver driver;
    ConfigReader config = new ConfigReader();

    @Test
    public void addToCartTest() {
        driver = DriverFactory.initDriver(config.get("browser"));
        driver.get(config.get("url"));

        CartPage cart = new CartPage(driver);
        cart.addToCart();

        driver.quit();
    }
}
