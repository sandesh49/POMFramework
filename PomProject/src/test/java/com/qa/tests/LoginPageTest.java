package com.qa.tests;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homepage;
    public LoginPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp()
    {
        Initializaton();
        loginPage = new LoginPage();
    }
    @Test(priority = 1)
    public void loginPageTitleTest()
    {
       String title= loginPage.validateLoginPageTitle();
        Assert.assertEquals(title,"Swag Labs");
    }
    @Test(priority = 2)
    public void LogoTest()
    {
      boolean flag = loginPage.validateLogo();
      Assert.assertTrue(flag);
    }
    @Test(priority = 3)
    public void LoginTest()
    {

        homepage = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
    }
    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }

}
