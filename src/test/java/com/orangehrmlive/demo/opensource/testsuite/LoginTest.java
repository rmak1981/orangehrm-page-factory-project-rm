package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.pages.HomePage;
import com.orangehrmlive.demo.opensource.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
 * Ravi's Creation
 * Date of Creation
 */
public class LoginTest extends TestBase {

    HomePage homePage;

    @BeforeMethod(groups = {"Regression"})
    public void setUp(){
        homePage = new HomePage();

    }
    @Test(priority = 0,groups = {"Regression"})
    public void userShouldLoginSuccessfully(){

        //log in with credentials
        homePage.enterUsernametoField("Admin");
        homePage.enterPasswordtoField("admin123");
        homePage.clickOnLoginBtn();

    }

}
