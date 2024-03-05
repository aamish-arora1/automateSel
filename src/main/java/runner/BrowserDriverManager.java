package runner;

import exceptions.InvalidTestDataException;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrowserDriverManager {
    private static final Logger logger = LoggerFactory.getLogger(BrowserDriverManager.class);
    private static WebDriver driver;

    public static WebDriver createNewWebDriver(String browserType,Boolean runInCi) {
        DriverManagerType driverManagerType=DriverManagerType.valueOf(browserType.toUpperCase());
        logger.info(String.format("creating driver for: on browser: '%s'  '%n;",browserType));
        WebDriver driver = null;
        switch(driverManagerType) {
            case CHROME:
                driver = createChromeWebDriver(runInCi);
                break;
            case FIREFOX:
                driver = createFirefoxDriver();
                break;
            case SAFARI:
                driver = createSafariDriver();
                break;
            case EDGE:
            case IEXPLORER:
            case CHROMIUM:
            case OPERA:
                throw new InvalidTestDataException(
                        String.format("Browser: '%s' is NOT supported", browserType));
        }
        return driver;
    }

    private static WebDriver createChromeWebDriver(Boolean runInCi) {
        if(runInCi)
        {
            driver=BrowserStackSetup.setupBrowserStackForChrome();
        }
        else {
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver(chromeOptions);
        }
        return driver;
    }

    private static WebDriver createSafariDriver() {
        return null;
    }

    private static WebDriver createFirefoxDriver() {
        return null;
    }
}
