package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import webLocators.AddEntitlementsPageElement;

public class AddEntitlementsPage {
    public WebDriver driver;

    public AddEntitlementsPage(WebDriver driver){
        this.driver = driver;
    }

    private By EntitlementsDropdownMenu = By.xpath(AddEntitlementsPageElement.EntitlementsDropdownMenu);
    private By AddEntitlementsPageLink = By.xpath(AddEntitlementsPageElement.AddEntitlementsPageLink);
    private By EmployeeName = By.xpath(AddEntitlementsPageElement.EmployeeName);
    private By LeaveType = By.xpath(AddEntitlementsPageElement.LeaveTypeDropdown);
    private By Entitlement = By.xpath(AddEntitlementsPageElement.Entitlement);
    private By SaveButton = By.xpath(AddEntitlementsPageElement.SaveButton);

    public void navigateToAddEntitlementsPage(){
        WebElement EntitlementsDropdown = driver.findElement(EntitlementsDropdownMenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(EntitlementsDropdown).perform();
        driver.findElement(AddEntitlementsPageLink).click();
    }

    public void enterEmployeeName(String employeeName) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(EmployeeName).sendKeys(employeeName);
        driver.findElement(EmployeeName).sendKeys(Keys.ENTER);
    }

    public void selectLeaveType(String leaveType){
        WebElement leavetype = driver.findElement(LeaveType);
        Select select = new Select(leavetype);
        select.selectByVisibleText(leaveType);
    }

    public void enterEntitlement(String entitlement){
        driver.findElement(Entitlement).sendKeys(entitlement);
    }

    public void pressSaveButton(){
        driver.findElement(SaveButton).click();
    }
}
