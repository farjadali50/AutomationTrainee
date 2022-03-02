package steps;

import Pages.AdminPage;
import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AdminStepDef {


    private AdminPage adminPage = new AdminPage(DriverFactory.getDriver());


    @And("Click admin")

    public void clickAdmin() {
        adminPage.adminButtonClick();
    }
}