package steps;

import Util.WebElements;
import factory.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.LoginPage;
import pages.RecruitmentPage;
import webLocators.LoginPageElement;
import webLocators.RecruitmentPageElement;


public class RecruitmentSteps {
    private final RecruitmentPage Recruitment = new RecruitmentPage(DriverFactory.getDriver());

    private By Jobtitle = By.xpath(RecruitmentPageElement.JobTitle);

   @Then("click on Recruitment Button")
    public void clickOnRecruitmentButton() {
       Recruitment.Recruitment();}

    @Then("select Jobtitle")
    public void selectJobTitle() throws InterruptedException
   // {Recruitment.selectJobTitle();}
   {
      WebElements.SelectLov(DriverFactory.getDriver(),Jobtitle,"Automation Tester");
    }

    @Then("verify user is on Recruitment Page")
    public void verifyUserIsOnRecruitmentPage() throws InterruptedException {
        Recruitment.verifyRecruitmentPageOpen();
    }

    @Then("Click on Add button")
    public void clickOnAddButton() throws InterruptedException {
       Recruitment.AddNewCandidate();
    }


    @Then("Add Basic Info {string},{string},{string},{string},{string}")
    public void addBasicInfo(String firstname,String middlename, String lastname,String email,String contactno) {
       Recruitment.BasicInfo(firstname,middlename,lastname,email,contactno);
    }


    @Then("Select Job Vacancy")
    public void selectJobVacancy() throws InterruptedException {
       Recruitment.selectJobVacancy();
    }

    @Then("Upload Resume")
    public void uploadResume() {
       Recruitment.UploadFile();
    }

    @Then("Save candidate record")
    public void saveCandidateRecord() {
       Recruitment.SaveCandidate();
    }
}
