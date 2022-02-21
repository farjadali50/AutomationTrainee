package steps;

import factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private DriverFactory driverFactory;
    private WebDriver driver;

    @Before()
    public void launchBrowser(){
        driverFactory = new DriverFactory();
        driver = driverFactory.setDriver("chrome");
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @After()
    public void closeBrowser(){
        driver.quit();
    }

}