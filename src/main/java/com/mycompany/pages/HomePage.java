package com.mycompany.pages;

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
//@DefaultUrl(webdriver.base.url)
public class HomePage extends PageObject {

    @FindBy(linkText = "Sign In")
    private WebElement signInLink;

    @FindBy(id = "cboxWrapper")
    private WebElement popupWindowJanrain;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void click_sign_in() {
        element(signInLink).click();
    }

    public void assert_popup_janrain() {
        element(popupWindowJanrain).shouldBeVisible();
    }
}
