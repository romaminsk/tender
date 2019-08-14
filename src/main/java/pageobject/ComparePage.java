package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComparePage extends BasePage {

    public ComparePage(WebDriver driver){
    }

    @FindBy(xpath = "//div[@class = 'rating__value']")
    private List<WebElement> ratingValueList;


    public List<WebElement> getRatingValueList(){
        return ratingValueList;
    }

}
