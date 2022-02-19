package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class DriverFactory {
    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver setDriver(String browserName) {
        switch (browserName.toLowerCase()){
            case "chrome":
                setChromeDriver();
            case "firefox":
                setFirefoxDriver();
            case "edge":
                setEdgeDriver();
            default:
                System.out.println("Invalid browser Name");
        }
        return getDriver();
    }

    public void setChromeDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void setFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    public void setEdgeDriver(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }
}
