package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CategoryPage extends BasePage{

    By onProductPage = By.id("icon-filter");
    By selectProduct =  new By.ByCssSelector("img[src='https://img-lcwaikiki.mncdn.com/mnpadding/600/800/ffffff/pim/productimages/20201/6931816/v1/l_20201-s4bi25z8-lu7_a.jpg']");

    public CategoryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isOnCategoryPage() {
        return isDisplayed(onProductPage);
    }

    public void clickProduct() {
        click(selectProduct);
    }

}
