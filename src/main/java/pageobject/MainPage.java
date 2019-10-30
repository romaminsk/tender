package pageobject;

import util.CustomLogger;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

        public MainPage clickSearchTarget(){
            CustomLogger.info("Clicking search target image");
            $(byId("search_target")).click();
            return page(MainPage.class);
        }

        public MainPage setSearchField(String search) {
            CustomLogger.info("Setting search field");
            $(byId("search_from_str")).sendKeys(search);
            return page(MainPage.class);
        }

        public MainPage assertSearch(String search){
            CustomLogger.info("Checking search input");
            $$(byXpath("//li[@class = 'b-results__li']")).get(0).shouldHave(text(search));
            return page(MainPage.class);
        }

}
