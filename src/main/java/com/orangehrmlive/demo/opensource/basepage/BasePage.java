package com.orangehrmlive.demo.opensource.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class BasePage {

    public static WebDriver driver;

    public BasePage(){
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/com/orangehrmlive/demo/opensource/resources/properties/log4j.properties");
        PageFactory.initElements(driver,this);

    }
}
