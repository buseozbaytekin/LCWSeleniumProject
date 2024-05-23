package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.CategoryPage;
import pages.ProductPage;
import pages.HomePage;


public class TestSteps extends BaseTest{

    HomePage homePage;
    CategoryPage categoryPage;
    ProductPage productPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void clickCategory() throws InterruptedException {
        homePage = new HomePage(webDriver);
        categoryPage = new CategoryPage(webDriver);
        homePage.clickCategory();
        Assertions.assertTrue(categoryPage.isOnCategoryPage(), "There is something wrong!");
    }

    @Test
    @Order(2)
    public void clickProduct() throws InterruptedException {
        productPage = new ProductPage(webDriver);
        categoryPage.clickProduct();
        Assertions.assertTrue(productPage.isOnProductPage(), "There is something wrong!");
    }

    @Test
    @Order(3)
    public void addCart() throws InterruptedException {
        productPage.addToCart();

    }

    @Test
    @Order(4)
    public void goToCart() throws InterruptedException {
        cartPage = new CartPage(webDriver);
        productPage.goToCart();
        Assertions.assertTrue(cartPage.isOnCartPage(), "There is something wrong!");
    }

   @Test
    public void backHomePage(){
        cartPage.goToHome();
        Assertions.assertTrue(homePage.isOnHomePage(), "There is something wrong!");
    }


}
