package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    public StartPage(WebDriver driver){
    }

    @FindBy(xpath = "//a[@data-id = 'market']")
    private WebElement marketButton;


    public WebElement getMarketButton(){
        return marketButton;
    }


}
