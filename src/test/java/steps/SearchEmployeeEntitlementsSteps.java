package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.SearchEmployeeEntitlementsPage;

public class SearchEmployeeEntitlementsSteps {

    private final SearchEmployeeEntitlementsPage searchEmployeeEntitlementsPage = new SearchEmployeeEntitlementsPage(DriverFactory.getDriver());

    @Then("user navigate to Employee Entitlements Page")
    public void userNavigateToEmployeeEntitlementsPage() {
        searchEmployeeEntitlementsPage.navigateToEmployeeEntitlementsPage();
    }

    @Then("user presses Search button")
    public void userPressesSearchButton() {
        searchEmployeeEntitlementsPage.pressSearchButton();
    }
}
