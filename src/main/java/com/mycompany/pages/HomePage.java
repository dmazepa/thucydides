package com.mycompany.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: dmazepa
 * Date: 01.08.12
 * Time: 14:20
 * To change this template use File | Settings | File Templates.
 */
@DefaultUrl("http://localhost:9000/dev01/")
public class HomePage extends PageObject {

    @FindBy(linkText = "Sign In")
    private WebElement signInLink;

    @FindBy(linkText = "My Account")
    private WebElement myAccountLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void click_sign_in() {
        element(signInLink).click();
    }

    public void click_my_account() {
        element(myAccountLink).click();
    }
}
