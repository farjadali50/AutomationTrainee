package steps;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

        // private WebDriver driver;

        @Before(order = 0)
        public void launchBrowser(){
            DriverFactory driverFactory = new DriverFactory();
            driverFactory.driver = driverFactory.setDriver("chrome");
            DriverFactory.driver.get("https://opensource-demo.orangehrmlive.com/");
        }

        @After(order = 0)
        public void closeBrowser(){
            DriverFactory.driver.quit();
        }


}
