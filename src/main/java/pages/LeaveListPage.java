package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import webLocators.LeaveListPageElement;


public class LeaveListPage {
    public WebDriver driver;

    public LeaveListPage(WebDriver driver){
        this.driver = driver;
    }

    private By LeaveEmployeeList = By.xpath(LeaveListPageElement.LeaveListPage);
    private By CalendarFrom = By.xpath(LeaveListPageElement.CalendarFrom);
    private By CalendarTo = By.xpath(LeaveListPageElement.CalendarTo);
    private By Year = By.xpath(LeaveListPageElement.year);
    private By Month = By.xpath(LeaveListPageElement.month);
    private By AllCheckbox = By.xpath(LeaveListPageElement.AllCheckbox);
    private By EmployeeName = By.xpath(LeaveListPageElement.EmployeeName);
    private By SearchBtn = By.xpath(LeaveListPageElement.SearchButton);

    public void NavigateToLeaveListPage(){
        driver.findElement(LeaveEmployeeList).click();
    }

    public void selectToDate(String fullDate) throws InterruptedException {
        driver.findElement(CalendarTo).click();
        Thread.sleep(2000);
        insertDate(fullDate);
    }

    public void insertDate(String fullDate){
        String month = fullDate.split(" ")[1].trim();
        String year = fullDate.split(" ")[2].trim();
        String date = fullDate.split(" ")[0].trim();
        Select selectYear = new Select(driver.findElement(Year));
        selectYear.selectByVisibleText(year);
        Select selectMonth = new Select(driver.findElement(Month));
        selectMonth.selectByVisibleText(month);
        driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
    }

    public void selectFromDate(String fullDate) throws InterruptedException {
        driver.findElement(CalendarFrom).click();
        Thread.sleep(2000);
        insertDate(fullDate);
    }

    public void selectAllCheckbox(){
        driver.findElement(AllCheckbox).click();
    }

    public void pressSearchBtn(){
        driver.findElement(SearchBtn).click();
    }

    public void enterEmployeeName(String empName){
        driver.findElement(EmployeeName).sendKeys(empName);
    }

}
