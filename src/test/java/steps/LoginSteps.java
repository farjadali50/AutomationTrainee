package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginSteps {

    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());


    @Then("user enter username {string}")
    public void userEnterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @Then("user enter password {string}")
    public void userEnterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("click on sign in button")
    public void clickOnSignInButton() {
        loginPage.pressLoginButton();
    }
}
