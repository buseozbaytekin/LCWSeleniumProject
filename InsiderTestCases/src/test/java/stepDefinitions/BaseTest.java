package stepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BaseTest {
    WebDriver webDriver = new ChromeDriver();

    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver.get("https://www.lcwaikiki.com/tr-TR/TR");
        webDriver.manage().window().maximize();
    }

    @AfterAll
    public void close(){
        webDriver.quit();
    }
}
