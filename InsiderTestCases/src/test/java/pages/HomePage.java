package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By categoryLocator = By.xpath("//a[@href='/ev-yasam-t-5']");
    By onHomePage = By.id("Component_250_2");

    public HomePage (WebDriver webDriver){
        super(webDriver);
    }

    public void clickCategory(){
        find(categoryLocator).click();
    }

    public boolean isOnHomePage() {
        return isDisplayed(onHomePage);
    }
}
