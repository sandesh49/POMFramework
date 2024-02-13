package com.qa.pages;

import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage extends TestBase {
    //page Factory or Object Repository
    @FindBy(name="user-name")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(name="login-button")
    WebElement loginBtn;

    @FindBy(xpath ="//div[contains(text(),'Swag Labs')]")
    WebElement Logo;

    public LoginPage()
    {
        PageFactory.initElements(driver, this);

    }

    //Actions
    public String validateLoginPageTitle()
    {
        return driver.getTitle();
    }
    public boolean validateLogo()
    {
       return Logo.isDisplayed();
    }

    public HomePage Login(String un, String pwd)
    {
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();
        return new HomePage();
    }

}
