package steps;

import Util.WebElements;
import factory.DriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.LoginPage;
import pages.RecruitmentPage;
import webLocators.LoginPageElement;
import webLocators.RecruitmentPageElement;

import javax.naming.Name;


public class RecruitmentSteps {
    private final RecruitmentPage Recruitment = new RecruitmentPage(DriverFactory.getDriver());
    private By Jobtitle = By.xpath(RecruitmentPageElement.JobTitle);
    private By ApplicationStatusLov = By.xpath(RecruitmentPageElement.ApplicationStatusLov);

   @Then("click on Recruitment Button")
    public void clickOnRecruitmentButton() {
       Recruitment.Recruitment();}

    @Then("select Jobtitle")
    public void selectJobTitle(String title) throws InterruptedException
   {
      WebElements.SelectLov(DriverFactory.getDriver(),Jobtitle,title);
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


    @Then("Search Candidate By Name {string},{string},{string}")
    public void searchCandidateByName(String firstname,String middlename, String lastname) {

       String FullName = firstname+" "+middlename+" "+lastname;
       Recruitment.SearchByCandidateName(FullName);
    }

    @Then("click on Search Button")
    public void clickOnSearchButton() throws InterruptedException {
       Recruitment.SearchButton();
    }

    @Then("select record from grid")
    public void selectRecordFromGrid() {
       Recruitment.SelectGridRecord();
    }

    @Then("change application status {string}")
    public void changeApplicationStatus(String status) throws InterruptedException {
        WebElements.SelectLov(DriverFactory.getDriver(),ApplicationStatusLov,status);
    }

    @Then("click on shortlist button")
    public void clickOnShortlistButton() throws InterruptedException {Recruitment.ShortlistBtn();
    }

    @Then("click on edit button")
    public void clickOnEditButton() {Recruitment.EditBtn();
    }

    @Then("edit the record")
    public void editTheRecord() {Recruitment.EditComment();
    }

    @Then("click on save button")
    public void clickOnSaveButton() {Recruitment.EditSaveBtn();
    }

    @Then("select record to delete")
    public void selectRecordToDelete() {Recruitment.SelectCheckBox();
    }

    @Then("click on delete button")
    public void clickOnDeleteButton() {Recruitment.DeleteBtn();
   }

    @Then("click on Ok button on delete Popup")
    public void clickOnOkButtonOnDeletePopup() {Recruitment.DeletePopUpOKBtn();
    }
}
