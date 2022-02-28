package steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginSteps {
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Then("enter username {string}")
    public void enterUsername(String username) {loginPage.enterUsername(username);
    }

    @Then("enter password {string}")
    public void enterPassword(String password) {loginPage.enterPassword(password);
    }

    @And("click on sign in button")
    public void clickOnSignInButton() throws InterruptedException {loginPage.clickOnLoginButton();
    }

    @Then("verify user is successfully login")
    public void verifyUserIsSuccessfullyLogin() throws InterruptedException {
        loginPage.verifyUserLoginSuccessful();
    }
}
