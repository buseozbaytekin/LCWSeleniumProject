package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

    By addToCartButton = By.id("pd_add_to_cart");
    By cartButton = By.xpath("//a[@href='https://www.lcw.com/sepetim']");

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(addToCartButton);
    }

    public void addToCart() {
        click(addToCartButton);
    }

    public void goToCart() {
        click(cartButton);
    }



}
