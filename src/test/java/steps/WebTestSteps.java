package steps;

import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import runner.Drivers;

import static enteties.Platform.web;

public class WebTestSteps {
    private static final Logger logger = LoggerFactory.getLogger(WebTestSteps.class);
    @Given("I navigate to a website")
    public void testWeb() {
        Drivers.createDriverForPlatform("Chrome",web,false);
        logger.info("driver created");
        Drivers.openURL("https://www.amazon.com/");
    }

    @Given("open website on browserstack")
    public void testWebBrowserStack() {
        Drivers.createDriverForPlatform("Chrome",web,true);
        logger.info("driver created");
        Drivers.openURL("https://www.amazon.com/");
    }
}
