package steps;

import factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    // private WebDriver driver;

    @Before(order = 0)
    public void launchBrowser(){
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.setDriver("chrome");
        DriverFactory.driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @After(order = 0)
    public void closeBrowser(){
        DriverFactory.driver.quit();
    }

}
