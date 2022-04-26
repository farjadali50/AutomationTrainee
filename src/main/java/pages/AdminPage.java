package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webLocators.AddEntitlementsPageElement;
import webLocators.AdminPageElement;

public class AdminPage {
    public WebDriver driver;

    public AdminPage(WebDriver driver){
        this.driver = driver;
    }

    private By AdminLink = By.xpath(AdminPageElement.adminMenu);
    //private By AddEntitlementsPageLink = By.xpath(AddEntitlementsPageElement.AddEntitlementsPageLink);

    public void clickOnAdmin() throws InterruptedException {
        driver.findElement(AdminLink).click();
        Thread.sleep(3000);
    }


}
