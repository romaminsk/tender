package step;

import org.openqa.selenium.WebDriver;
import pageobject.ComparePage;
import pageobject.ElektronikaPage;
import pageobject.MarketPage;
import pageobject.StartPage;

public abstract class BaseStep {

    protected StartPage startPage;
    protected MarketPage marketPage;
    protected ElektronikaPage elektronikaPage;
    protected ComparePage comparePage;

    public BaseStep(WebDriver driver){
        this.startPage = new StartPage(driver);
        this.marketPage = new MarketPage(driver);
        this.elektronikaPage = new ElektronikaPage(driver);
        this.comparePage = new ComparePage(driver);
    }

}
