package Steps;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {

    private final pages.LoginPage loginPage = new pages.LoginPage(DriverFactory.getDriver());


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
     //   loginPage.pressLoginButton();
    }
    }

