package com.mycompany.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.FindBy;

public class GlobalHeaderFooterPage extends PageObject {

    public GlobalHeaderFooterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "cartHeader")
    private WebElement cart;

    @FindBy(linkText = "Sign In")
    private WebElement signInLink;

    @FindBy(linkText = "Sign Out")
    private WebElement signOutLink;

    @FindBy(linkText = "My Account")
    private WebElement myAccountLink;

    @FindBy(xpath = "//a[@class='top-link-checkout']")
    private WebElement buttonCheckout;

    public void click_sign_in() {
        element(signInLink).click();
    }

    public void click_my_account() {
        element(myAccountLink).click();
    }

    public void click_on_my_cart() {
        element(cart).click();
    }

    public void roll_over_on_cart() {
        Locatable hoverItem = (Locatable) cart;
        Mouse mouse = ((HasInputDevices) getDriver()).getMouse();
        mouse.mouseMove(hoverItem.getCoordinates());
    }

    public void click_sign_out() {
        element(signOutLink).click();
    }

    public void click_on_checkout_button() {
        element(buttonCheckout).click();
        //getDriver().findElement(By.xpath("//button[@class='button btn-proceed-checkout btn-checkout']")).click();
    }
}
