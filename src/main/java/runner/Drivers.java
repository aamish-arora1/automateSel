package runner;

import enteties.Platform;
import exceptions.RunTimeExceptions;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Drivers {
    private static final Logger logger = LoggerFactory.getLogger(Drivers.class);
    static WebDriver driver =null;
    public static  WebDriver createDriverForPlatform(String browserName,
                                                  Platform forPlatform, Boolean runInCi) {
        logger.info(String.format("creating driver for: '%s', on browser: '%s'  '%n;",forPlatform,browserName));
        switch (forPlatform) {
            case android:
                driver = createNewAndroidDriver();
                break;
            case web:
                driver = BrowserDriverManager.createNewWebDriver(browserName,runInCi);
                break;
            default:
                throw new RunTimeExceptions("invalid platform");
        }
        return driver;
    }



    private static WebDriver createNewAndroidDriver() {
        return null;
    }

    public static WebDriver openURL(String s) {
        driver.get(s);
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }
}
