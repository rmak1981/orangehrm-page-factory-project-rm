package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class HomePage extends UtilityRM {

    // log4j properties

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement _enterUsername;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement _enterPassword;
    @FindBy(id = "btnLogin")
    WebElement _loginClick;



    public void enterUsernametoField(String username){
        Reporter.log("enter user name"+username+"to the field"+_enterUsername.toString()+"<br>");
        sendTextToElement(_enterUsername,username);
        log.info("enter user name"+username+"to the field"+_enterUsername.toString());
    }
    public void enterPasswordtoField(String password){
        Reporter.log("enter password"+password+"to the field"+_enterPassword.toString()+"<br>");
        sendTextToElement(_enterPassword,password);
        log.info("enter password"+password+"to the field"+_enterPassword.toString());
    }
    public void clickOnLoginBtn(){
        Reporter.log("click on log in brn"+_loginClick.toString()+"<br>");
        clickOnElement(_loginClick);
        log.info("click on log in brn"+_loginClick.toString());
    }


}
