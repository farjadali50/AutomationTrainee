package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.AddEntitlementsPage;

public class AddEntitlementsSteps {

    private final AddEntitlementsPage addEntitlementsPage = new AddEntitlementsPage(DriverFactory.getDriver());

    @Then("user navigate to Add Entitlements Page")
    public void userNavigateToAddEntitlementsPage() {
        addEntitlementsPage.navigateToAddEntitlementsPage();
    }

    @Then("user enter employee name {string}")
    public void userEnterEmployeeName(String empName) throws InterruptedException {
        addEntitlementsPage.enterEmployeeName(empName);
    }

    @Then("user selects leave type {string}")
    public void userSelectsLeaveType(String leaveType) {
        addEntitlementsPage.selectLeaveType(leaveType);
    }

    @Then("user enter entitlement {string}")
    public void userEnterEntitlement(String entitlement) {
        addEntitlementsPage.enterEntitlement(entitlement);
    }

    @Then("user presses save button")
    public void userPressesSaveButton() {
        addEntitlementsPage.pressSaveButton();
    }
}
