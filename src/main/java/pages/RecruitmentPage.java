package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import webLocators.LoginPageElement;
import webLocators.RecruitmentPageElement;
import  org.openqa.selenium.WebElement;
import Util.WebElements;

public class RecruitmentPage {
    public WebDriver driver;

    public RecruitmentPage(WebDriver driver) {this.driver = driver; }

    private By Recruitment = By.xpath(RecruitmentPageElement.RecruitmentBtn);
    private By Jobtitle = By.xpath(RecruitmentPageElement.JobTitle);
    private By Addbutton = By.xpath(RecruitmentPageElement.AddBtn);
    private By FirstName = By.xpath(RecruitmentPageElement.FirstName);
    private By MiddleName = By.xpath(RecruitmentPageElement.MiddleName);
    private By LastName = By.xpath(RecruitmentPageElement.LastName);
    private By Email = By.xpath(RecruitmentPageElement.Email);
    private By ContactNo = By.xpath(RecruitmentPageElement.ContactNo);
    private By Jobvacancy = By.xpath(RecruitmentPageElement.Jobvacancy);
    private By FileUploadBtn = By.xpath(RecruitmentPageElement.uploadFileBtn);
    private By SaveBtn = By.xpath((RecruitmentPageElement.Savebtn));


    public void Recruitment(){
        driver.findElement(Recruitment).click();
    }

    public void AddNewCandidate() throws InterruptedException {
        driver.findElement(Addbutton).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("Add Candidate"));
    }

    public void verifyRecruitmentPageOpen() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("Candidates"));
    }

   public void selectJobTitle() throws InterruptedException {
        Select JobTitle = new Select(driver.findElement(Jobtitle));
        JobTitle.selectByVisibleText("All");
    }

    public void BasicInfo(String firstname, String middlname, String lastname, String email, String contactno){
        driver.findElement(FirstName).sendKeys(firstname);
        driver.findElement(MiddleName).sendKeys(middlname);
        driver.findElement(LastName).sendKeys(lastname);
        driver.findElement(Email).sendKeys(email);
        driver.findElement(ContactNo).sendKeys(contactno);}

    public void selectJobVacancy() throws InterruptedException {
        Select JobVacancy = new Select(driver.findElement(Jobvacancy));
        JobVacancy.selectByVisibleText("Software Engineer");
    }

    public void UploadFile(){
        driver.findElement(FileUploadBtn).sendKeys("D:\\Farhan\\Sanctions_Quiz.pdf");
    }

    public void SaveCandidate(){
        driver.findElement(SaveBtn).click();
        Assert.assertTrue(driver.getPageSource().contains("Status: Application Initiated"));

    }

}