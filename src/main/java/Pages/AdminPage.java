package Pages;

import WebLocators.AdminElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

    public WebDriver driver;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    private By AdminClick = By.xpath(AdminElement.Admin);


    public void adminButtonClick() {
        driver.findElement(AdminClick).click();

    }
}



