package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webLocators.LoginPageElement;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.xpath(LoginPageElement.username);
    private By passwordField = By.xpath(LoginPageElement.password);
    private By loginBtn = By.xpath(LoginPageElement.loginbtn);

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickOnLoginButton() throws InterruptedException {
        driver.findElement(loginBtn).click();
        Thread.sleep(2000);

    }



}