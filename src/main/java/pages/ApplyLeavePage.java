package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import webLocators.ApplyLeavePageElement;

public class ApplyLeavePage {
    public WebDriver driver;

    public ApplyLeavePage(WebDriver driver){
        this.driver = driver;
    }

    private By LeavePage = By.xpath(ApplyLeavePageElement.leavePageLink);
    private By ApplyLeavePage = By.xpath(ApplyLeavePageElement.AssignLeavePage);
    private By EmployeeName = By.xpath(ApplyLeavePageElement.employeeName);
    private By LeaveTypeDropdown = By.xpath(ApplyLeavePageElement.leaveType);
    private By CalendarFrom = By.xpath(ApplyLeavePageElement.calendarFrom);
    private By CalendarTo = By.xpath(ApplyLeavePageElement.calendarTo);
    private By Month = By.xpath(ApplyLeavePageElement.month);
    private By Year = By.xpath(ApplyLeavePageElement.year);
    private By AssignButton = By.xpath(ApplyLeavePageElement.AssignButton);

    public void goToLeavePage() throws InterruptedException {
        driver.findElement(LeavePage).click();
        Thread.sleep(3000);
    }

    public void goToApplyLeavePage(){
        driver.findElement(ApplyLeavePage).click();
    }

    public void enterEmployeeName(String employeeName){
        driver.findElement(EmployeeName).sendKeys(employeeName);
    }

    public void selectLeaveType(String leaveType){
        WebElement leavetype = driver.findElement(LeaveTypeDropdown);
        Select select = new Select(leavetype);
        select.selectByVisibleText(leaveType);
    }

    public void selectFromDate(String fromDate) throws InterruptedException {
        driver.findElement(CalendarFrom).click();
        Thread.sleep(3000);
        insertDate(fromDate);
//        String month = fromDate.split(" ")[1].trim();
//        String year = fromDate.split(" ")[2].trim();
//        String date = fromDate.split(" ")[0].trim();
//        Select selectYear = new Select(driver.findElement(Year));
//        selectYear.selectByVisibleText(year);
//        Select selectMonth = new Select(driver.findElement(Month));
//        selectMonth.selectByVisibleText(month);
//        driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
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

    public void selectToDate(String toDate) throws InterruptedException {
        driver.findElement(CalendarTo).click();
        Thread.sleep(3000);
        insertDate(toDate);
//        String month = toDate.split(" ")[1].trim();
//        String year = toDate.split(" ")[2].trim();
//        String date = toDate.split(" ")[0].trim();
//        Select selectYear = new Select(driver.findElement(Year));
//        selectYear.selectByVisibleText(year);
//        Select selectMonth = new Select(driver.findElement(Month));
//        selectMonth.selectByVisibleText(month);
//        driver.findElement(By.xpath("//a[text()='"+date+"']")).click();

    }

    public void pressAssignButton() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(AssignButton).click();
    }

}
