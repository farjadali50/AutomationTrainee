package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.AdminPage;

public class AdminSteps {

    private final AdminPage adminPage = new AdminPage(DriverFactory.getDriver());

    @Then("move to user page")
    public void moveToUserPage() throws InterruptedException {
        adminPage.clickOnAdmin();
    }
}
