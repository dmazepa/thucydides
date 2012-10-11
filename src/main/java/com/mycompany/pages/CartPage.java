package com.mycompany.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: dmazepa
 * Date: 01.08.12
 * Time: 14:20
 * To change this template use File | Settings | File Templates.
 */
@DefaultUrl("http://localhost:9000/dev01/checkout/cart/")
public class CartPage extends PageObject {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='top-link-checkout']")
    private WebElement buttonCheckout;

    public void click_on_checkout_button() {
        element(buttonCheckout).click();
    }

    public void assert_on_cart_page() {
        assertThat(getDriver().getCurrentUrl(), is("http://bdohdev.lcgosc.com/dev01/checkout/cart/"));
    }
}
