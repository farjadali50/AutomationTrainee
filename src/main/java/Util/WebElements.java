package Util;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import webLocators.RecruitmentPageElement;

public class WebElements {

    public static void SelectLov(WebDriver driver, By path, String value)  {

        Select JobTitle = new Select(driver.findElement(path));
        JobTitle.selectByVisibleText(value);

    }

}
