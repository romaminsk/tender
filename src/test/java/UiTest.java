import driver.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebDriver;
import step.CompareStep;
import step.ElektronikaStep;
import step.MarketStep;
import step.StartStep;
import util.JsonDataReader;
import util.WaitUtils;

import java.util.Map;

@Category(UiTest.class)
public class UiTest extends BaseTest {

    protected static WebDriver driver;

    private static Map<String, String> searchData;

    private static StartStep startStep;
    private static MarketStep marketStep;
    private static ElektronikaStep elektronikaStep;
    private static CompareStep compareStep;

    @BeforeClass
    public static void preparationForTest() {
        driver = WebDriverManager.getDriver();
        searchData = JsonDataReader.getSearchData();
        startStep = new StartStep(driver);
        marketStep = new MarketStep(driver);
        elektronikaStep = new ElektronikaStep(driver);
        compareStep = new CompareStep(driver);
    }

    @Test
    public void checkSearchResults(){
        startStep.clickMarketButton();
        marketStep.clickElektronikaButton();
        elektronikaStep.clickTelevizoryButton();
        String highPrice = searchData.get("highPrice");
        elektronikaStep.setPriceToField(highPrice);
        elektronikaStep.clickDiagonalSmallCheckbox();
        WaitUtils.sleep(3000);
        elektronikaStep.clickCheckBoxOfRecommendedTvList();
        String recommendedTvListSize = elektronikaStep.getRecommendedTvListSize();
        WaitUtils.sleep(3000);
        elektronikaStep.clickCompareButton();
        Assert.assertEquals(recommendedTvListSize, compareStep.getRatingValueListSize());
    }

}
