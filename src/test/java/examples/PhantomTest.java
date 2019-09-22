package examples;

import com.opera.core.systems.OperaDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class PhantomTest {
    private WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.phantomjs().setup();
    }

    @BeforeMethod
    public void setupTest() {
        driver = new PhantomJSDriver();
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