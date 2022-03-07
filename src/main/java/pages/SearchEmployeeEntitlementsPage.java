package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import webLocators.SearchEmployeeEntitlementsPageElement;

public class SearchEmployeeEntitlementsPage {
    public WebDriver driver;

    public SearchEmployeeEntitlementsPage(WebDriver driver){
        this.driver = driver;
    }

    private By EntitlementsDropdownMenu = By.xpath(SearchEmployeeEntitlementsPageElement.EntitlementsDropdownMenu);
    private By EmployeeEntitlements = By.xpath(SearchEmployeeEntitlementsPageElement.EmployeeEntitlements);
    private By SearchButton = By.xpath(SearchEmployeeEntitlementsPageElement.SearchButton);

    public void navigateToEmployeeEntitlementsPage(){
        WebElement EntitlementsDropdown = driver.findElement(EntitlementsDropdownMenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(EntitlementsDropdown).perform();
        driver.findElement(EmployeeEntitlements).click();
    }

    public void pressSearchButton(){
        driver.findElement(SearchButton).click();
    }
}
