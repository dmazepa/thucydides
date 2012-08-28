package com.mycompany.pages;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: dmazepa
 * Date: 01.08.12
 * Time: 14:20
 * To change this template use File | Settings | File Templates.
 */
@DefaultUrl("http://localhost:9000/dev01/customer/account/index/")
@At("https://bdohdev.lcgosc.com/dev01/customer/account/index/")

public class MyAccountPage extends PageObject {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void assert_created_account() {
        //assertEquals(getDriver().getCurrentUrl(), "https://bdohdev.lcgosc.com/dev01/customer/account/index/");
        element(blockSuccessMsg).shouldBeVisible();
        element(linkSignOut).shouldBeVisible();
    }

    @FindBy(xpath = "//li[@class='success-msg']")
    private WebElement blockSuccessMsg;

    @FindBy(linkText = "Sign Out")
    private WebElement linkSignOut;
}
