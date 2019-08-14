package util;

import driver.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class ScreenShotOnFailure implements MethodRule {

    private Calendar calendar = Calendar.getInstance();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

    public ScreenShotOnFailure(WebDriver driver) {

    }

    public Statement apply(final Statement statement, final FrameworkMethod frameworkMethod, final Object o) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                    statement.evaluate();
                } catch (Throwable t) {
                    captureScreenShot(frameworkMethod.getName());
                    throw t;
                }
            }

            public void captureScreenShot(String fileName) throws IOException {
                File scrFile = ((TakesScreenshot) WebDriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
                String screenshotName =
                        new File(System.getProperty("user.dir")).getAbsolutePath()
                                + "/target/"
                                + "_" + formatter.format(calendar.getTime()) + ".jpg";
                File targetFile = new File(screenshotName);
                FileUtils.copyFile(scrFile, targetFile);
            }
        };
    }
}
