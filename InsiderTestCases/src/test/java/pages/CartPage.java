package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    By homeButton = By.id("Layer_1");
    By onCartPage = By.id("ShoppingCartContent");


    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isOnCartPage() {
        return isDisplayed(onCartPage);
    }

    public void goToHome() {
        click(homeButton);
    }
}
