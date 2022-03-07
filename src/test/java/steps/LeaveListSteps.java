package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.LeaveListPage;

public class LeaveListSteps {

    private final LeaveListPage leaveListPage = new LeaveListPage(DriverFactory.getDriver());

    @Then("user navigate to Leave List page")
    public void userNavigateToLeaveListPage() {
        leaveListPage.NavigateToLeaveListPage();
    }

    @Then("user enters From Date {string}")
    public void userEntersFromDate(String fromDate) throws InterruptedException {
        leaveListPage.selectFromDate(fromDate);
    }

    @Then("user enters To Date {string}")
    public void userEntersToDate(String toDate) throws InterruptedException {
        leaveListPage.selectToDate(toDate);
    }


    @Then("user selects All status checkbox")
    public void userSelectsAllStatusCheckbox() {
        leaveListPage.selectAllCheckbox();
    }

    @Then("user clicks on Search Button")
    public void userClicksOnSearchButton() {
        leaveListPage.pressSearchBtn();
    }

    @Then("user enters Employee name {string}")
    public void userEntersEmployeeName(String empName) {
        leaveListPage.enterEmployeeName(empName);
    }
}
