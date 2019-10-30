import org.testng.annotations.Test;
import pageobject.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class UiTest {

    private static final String SELENIDE = "Selenide";


    @Test
    public void findSelenide() {
        MainPage mainPage = open(("https://www.tut.by/"), MainPage.class);
        mainPage.setSearchField(SELENIDE);
    }

}
