package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class FirefoxTest {
    private WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeMethod
    public void setupTest() {
        driver = new FirefoxDriver();
    }

    @AfterMethod
    public void tearDownTest() {
        if (driver != null) driver.quit();
    }

    @Test
    public void testChrome() {
        driver.get("https://www.google.com");
        assertEquals(driver.getTitle(), "Google");
    }
}