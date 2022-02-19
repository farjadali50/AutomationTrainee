package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webLocators.LoginPageElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.xpath(LoginPageElement.usernameField);
    private By passwordField = By.xpath(LoginPageElement.passwordField);
    private By loginButton = By.xpath(LoginPageElement.loginButton);

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void pressLoginButton(){
        driver.findElement(loginButton).click();
    }
}
