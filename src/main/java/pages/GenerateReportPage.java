package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import webLocators.GenerateReportPageElement;

public class GenerateReportPage {
    public WebDriver driver;

    public GenerateReportPage(WebDriver driver){
        this.driver = driver;
    }

    private By LeaveEntitlementReport = By.xpath(GenerateReportPageElement.LeaveEntitlementReport);
    private By LeaveBalanceReport = By.xpath(GenerateReportPageElement.LeaveBalanceReport);
    private By GenerateForDropdown = By.xpath(GenerateReportPageElement.GenerateFor);
    private By EmployeeName = By.xpath(GenerateReportPageElement.EmployeeName);
    private By ViewButton = By.xpath(GenerateReportPageElement.ViewButton);

    public void navigateToReportPage(){
        WebElement Report = driver.findElement(LeaveEntitlementReport);
        Actions actions = new Actions(driver);
        actions.moveToElement(Report).perform();
        driver.findElement(LeaveBalanceReport).click();
    }

    public void generateFor(String value) throws InterruptedException {
        WebElement Dropdown = driver.findElement(GenerateForDropdown);
        Select select = new Select(Dropdown);
        select.selectByVisibleText(value);
        Thread.sleep(1000);
    }

    public void enterEmpName(String empName){
        driver.findElement(EmployeeName).sendKeys(empName);
        driver.findElement(EmployeeName).sendKeys(Keys.ENTER);
    }

    public void clickViewButton() throws InterruptedException {
        driver.findElement(ViewButton).click();
        Thread.sleep(5000);
    }
}
