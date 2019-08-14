package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.CustomLogger;
import util.WaitUtils;

import java.util.List;

public class ElektronikaStep extends BaseStep {

    public ElektronikaStep(WebDriver driver){
        super(driver);
    }

    private static final int LOW_RANGE_TV_ITEM = 0;
    private static final int HIGH_RANGE_TV_ITEM = 5;


    public void clickTelevizoryButton(){
        WebElement televizoryButton = elektronikaPage.getTelevizoryButton();
        WaitUtils.waitForElementClickable(televizoryButton);
        CustomLogger.info("Clicking televizory button");
        televizoryButton.click();
    }

    public void setPriceToField(String highPrice){
        WebElement priceToField = elektronikaPage.getPriceToField();
        WaitUtils.waitForElementClickable(priceToField);
        CustomLogger.info("Setting price to field");
        priceToField.sendKeys(highPrice);
    }

    public void clickDiagonalSmallCheckbox(){
        WebElement diagonalSmallCheckbox = elektronikaPage.getDiagonalSmallCheckbox();
        WaitUtils.waitForElementClickable(diagonalSmallCheckbox);
        CustomLogger.info("Clicking diagonal small checkbox");
        diagonalSmallCheckbox.click();
    }

    public void clickCheckBoxOfRecommendedTvList() {
        List<WebElement> checkBoxOfRecommendedTvList = elektronikaPage.getCheckBoxOfRecommendedTvList();
        CustomLogger.info("Clicking checkbox of recommended tv");
        for (WebElement element : checkBoxOfRecommendedTvList.subList(LOW_RANGE_TV_ITEM,HIGH_RANGE_TV_ITEM)) {
            element.click();
        }
    }

    public void clickCompareButton(){
        WebElement compareButton = elektronikaPage.getCompareButton();
        WaitUtils.waitForElementClickable(compareButton, 20);
        CustomLogger.info("Clicking compare button");
        compareButton.click();
    }

    public String getRecommendedTvListSize(){
        List<WebElement> checkBoxOfRecommendedTvList = elektronikaPage.getCheckBoxOfRecommendedTvList();
        return String.valueOf(checkBoxOfRecommendedTvList.subList(LOW_RANGE_TV_ITEM,HIGH_RANGE_TV_ITEM).size());
    }

}
