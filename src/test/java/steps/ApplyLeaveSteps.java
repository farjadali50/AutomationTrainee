package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.ApplyLeavePage;

public class ApplyLeaveSteps {

    private final ApplyLeavePage leavePage = new ApplyLeavePage(DriverFactory.getDriver());

    @Then("user navigate to Leave Page")
    public void userNavigateToLeavePage() throws InterruptedException {
        leavePage.goToLeavePage();
    }

    @Then("user navigate to Apply Leave Page")
    public void userNavigateToApplyLeavePage(){
        leavePage.goToApplyLeavePage();
    }

    @Then("user enter Employee Name {string}")
    public void userEnterEmployeeName(String employeeName) {
        leavePage.enterEmployeeName(employeeName);
    }

    @Then("user selects Leave Type {string}")
    public void userSelectsLeaveType(String leaveType) {
        leavePage.selectLeaveType(leaveType);
    }

    @Then("user selects From Date {string}")
    public void userSelectsFromDate(String fromDate) throws InterruptedException {
        leavePage.selectFromDate(fromDate);
    }

    @Then("user selects To Date {string}")
    public void userSelectsToDate(String toDate) throws InterruptedException {
        leavePage.selectToDate(toDate);
    }

    @Then("user presses Assign button")
    public void userPressesAssignButton() throws InterruptedException {
        leavePage.pressAssignButton();
    }
}
