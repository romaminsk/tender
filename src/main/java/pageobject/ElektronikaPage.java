package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ElektronikaPage extends BasePage {

    public ElektronikaPage(WebDriver driver){
    }

    @FindBy(xpath = "//a[contains(@href, 'televizory')]")
    private WebElement televizoryButton;

    @FindBy(xpath = "//*[contains(@id, 'priceto')]")
    private WebElement priceToField;

    @FindBy(xpath = "//span[contains(text(),'32\"')]")
    private WebElement diagonalSmallCheckbox;

    @FindBy(xpath = "//div[contains(@class, 'tag_recommend')]//ancestor::div[contains(@id,'product')]//div[contains(@class,'n-product-toolbar__item')]")
    private List<WebElement> checkBoxOfRecommendedTvList;

    @FindBy(xpath = "//a[contains (@class, 'button_theme_normal')]")
    private WebElement compareButton;


    public WebElement getTelevizoryButton(){
        return televizoryButton;
    }

    public WebElement getPriceToField(){
        return priceToField;
    }

    public WebElement getDiagonalSmallCheckbox(){
        return diagonalSmallCheckbox;
    }

    public List<WebElement> getCheckBoxOfRecommendedTvList(){
        return checkBoxOfRecommendedTvList;
    }

    public WebElement getCompareButton(){
        return compareButton;
    }


}
