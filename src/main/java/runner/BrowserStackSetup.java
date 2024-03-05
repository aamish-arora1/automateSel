package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class BrowserStackSetup {
    private static final Logger logger = LoggerFactory.getLogger(Drivers.class);
    public static final String USERNAME = "aamisharora_dts6KY";
    public static final String AUTOMATE_KEY = "xsKyp2Q3vjsVp9AyzD2v";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY +
            "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver setupBrowserStackForChrome() {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Mac");
        caps.setCapability("browserName", "chrome");
        caps.setCapability("browserVersion", "80");

        WebDriver driver;
        try {
            driver = new RemoteWebDriver(new URL(URL), caps);
        }
        catch (Exception e){
            logger.info("exception caught");
            throw new RuntimeException(e);
        }
        return driver;
    }
}
