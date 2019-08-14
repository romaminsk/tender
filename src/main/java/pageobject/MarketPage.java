package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPage extends BasePage {

    public MarketPage(WebDriver driver){
    }

    @FindBy(xpath = "//a[contains(@href, 'elektronika')]")
    private WebElement electronikaButton;


    public WebElement getElectronikaButton(){
        return electronikaButton;
    }

}
