import driver.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import util.ScreenShotOnFailure;

public abstract class BaseTest {

    private static WebDriver driver;

    @Rule
    public ScreenShotOnFailure failure = new ScreenShotOnFailure(driver);

    @BeforeClass
    public static void preparationForTest() {
        driver = WebDriverManager.getDriver();
    }

    @AfterClass
    public static void cleanUp(){
        WebDriverManager.closeDriver();
    }

}
