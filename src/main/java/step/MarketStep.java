package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.CustomLogger;
import util.WaitUtils;

public class MarketStep extends BaseStep {

    public MarketStep(WebDriver driver){
        super(driver);
    }


    public void clickElektronikaButton(){
        WebElement elektronikaButton = marketPage.getElectronikaButton();
        WaitUtils.waitForElementClickable(elektronikaButton);
        CustomLogger.info("Clicking elektronika button");
        elektronikaButton.click();
    }

}
