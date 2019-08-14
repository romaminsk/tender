package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.CustomLogger;
import util.WaitUtils;

public class StartStep extends BaseStep {

    public StartStep(WebDriver driver){
        super(driver);
    }


    public void clickMarketButton(){
        WebElement marketButton = startPage.getMarketButton();
        WaitUtils.waitForElementClickable(marketButton);
        CustomLogger.info("Clicking market button");
        marketButton.click();
    }

}
