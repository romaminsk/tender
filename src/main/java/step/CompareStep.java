package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CompareStep extends BaseStep {

    public CompareStep(WebDriver driver){
        super(driver);
    }

    public String getRatingValueListSize(){
        List<WebElement> ratingValueList = comparePage.getRatingValueList();
        return String.valueOf(ratingValueList.size());
    }

}
