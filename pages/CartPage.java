package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    By addToCartBtn = By.xpath("//button[text()='Add to Cart']");
    By cartIcon = By.id("cart");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
        driver.findElement(cartIcon).click();
    }
}
