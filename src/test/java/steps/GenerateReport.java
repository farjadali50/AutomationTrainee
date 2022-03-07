package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.GenerateReportPage;

public class GenerateReport {

    private final GenerateReportPage generateReportPage = new GenerateReportPage(DriverFactory.getDriver());

    @Then("user navigate to Leave Entitlements and Usage Report")
    public void userNavigateToLeaveEntitlementsAndUsageReport() {
        generateReportPage.navigateToReportPage();
    }

    @Then("user selects Generate For {string}")
    public void userSelectsGenerateFor(String generateFor) throws InterruptedException {
        generateReportPage.generateFor(generateFor);
    }


    @Then("user clicks View Button")
    public void userClicksViewButton() throws InterruptedException {
        generateReportPage.clickViewButton();
    }

    @Then("user Enters Employee name {string}")
    public void userEntersEmployeeName(String empName) {
        generateReportPage.enterEmpName(empName);
    }
}
