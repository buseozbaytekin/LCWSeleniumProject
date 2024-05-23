package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement find(By locator){
        return webDriver.findElement(locator);
    }

    public void click(By element){
        find(element).click();
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

}
