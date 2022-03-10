package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webLocators.LoginPageElement;

import java.sql.Driver;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.xpath(LoginPageElement.username);
    private By passwordField = By.xpath(LoginPageElement.password);
    private By loginBtn = By.xpath(LoginPageElement.loginbtn);
    private By LogoutDropdown = By.xpath(LoginPageElement.logoutbtn);
    private By Logoutbtn = By.xpath(LoginPageElement.signoutbtn);

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

    public void verifyUserLoginSuccessful() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("Dashboard"));
    }

    public void LogOut() throws InterruptedException {
        driver.findElement(LogoutDropdown).click();
        Thread.sleep(2000);
        driver.findElement(Logoutbtn).click();
    }

}