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
@DefaultUrl("https://localhost:9000/dev01/checkout/onepage/")
public class CheckoutPage extends PageObject {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login:guest")
    private WebElement inputCheckoutAsGuest;

    @FindBy(id = "onepage-guest-register-button")
    private WebElement buttonContinue;

    @FindBy(id = "billing:firstname")
    private WebElement fieldFirstName;

    @FindBy(id = "billing:lastname")
    private WebElement fieldLastName;

    @FindBy(id = "billing:email")
    private WebElement fieldEmail;

    @FindBy(id = "billing:street1")
    private WebElement fieldAddress;

    @FindBy(id = "billing:city")
    private WebElement fieldCity;

    @FindBy(id = "billing:postcode")
    private WebElement fieldPostalCode;

    @FindBy(id = "billing:region_id")
    private WebElement selectState;

    @FindBy(id = "p_method_ccsave")
    private WebElement inputCreditCart;

    @FindBy(id = "billing:telephone")
    private WebElement fieldTelephone;

    @FindBy(id = "ccsave_cc_type")
    private WebElement selectCartType;

    @FindBy(id = "ccsave_cc_cid")
    private WebElement fieldVerificationNumber;

    @FindBy(id = "ccsave_expiration")
    private WebElement selectMonth;

    @FindBy(id = "ccsave_expiration_yr")
    private WebElement selectYear;

    @FindBy(id = "ccsave_cc_number")
    private WebElement fieldCartNumber;

    @FindBy(id = "ccsave_cc_owner")
    private WebElement fieldCartName;

    @FindBy(xpath = "//div[@id='billing-buttons-container']/button")
    private WebElement buttonContinue1;

    @FindBy(xpath = "//div[@id='shipping-method-buttons-container']/button")
    private WebElement buttonContinue2;

    @FindBy(xpath = "//div[@id='payment-buttons-container']/button")
    private WebElement buttonContinue3;

    @FindBy(xpath = "//div[@id='review-buttons-container']/button")
    private WebElement buttonPlaceOrder;

    public void fill_first_name_field() {
        element(fieldFirstName).type("TestFirstName");
    }

    public void choose_checkout_as_guest() {
        assertThat(getDriver().getCurrentUrl(), is("https://bdohdev.lcgosc.com/dev01/checkout/onepage/"));
        element(inputCheckoutAsGuest).click();
    }

    public void click_on_continue_button() {
        element(buttonContinue).click();
    }

    public void fill_last_name_field() {
        element(fieldLastName).type("TestLastName");
    }

    public void fill_email_field() {
        element(fieldEmail).type("test1@speroteck.com");
    }

    public void fill_address_field() {
        element(fieldAddress).type("Test Address");
    }

    public void fill_city_field() {
        element(fieldCity).type("Test City");
    }

    public void select_state() {
        element(selectState).selectByVisibleText("California");
    }

    public void fill_postal_code_field() {
        element(fieldPostalCode).type("11111");
    }

    public void fill_telephone_field() {
        element(fieldTelephone).type("1234567890");
    }

    public void click_on_continue_button1() {
        element(buttonContinue1).click();
    }

    public void click_on_continue_button2() {
        element(buttonContinue2).click();
    }

    public void click_on_credit_cart_input() {
        element(inputCreditCart).waitUntilVisible();
        element(inputCreditCart).click();
    }

    public void fill_cart_name_field() {
        element(fieldCartName).type("Visa");
    }

    public void fill_cart_number_field() {
        element(fieldCartNumber).type("4111111111111111");
    }

    public void select_cart_type() {
        element(selectCartType).selectByVisibleText("Visa");
    }

    public void select_month() {
        element(selectMonth).selectByVisibleText("03 - March");
    }

    public void select_year() {
        element(selectYear).selectByVisibleText("2022");
    }

    public void fill_verification_number_field() {
        element(fieldVerificationNumber).type("111");
    }

    public void click_button_continue3() {
        element(buttonContinue3).click();
    }

    public void click_button_place_order() {
        element(buttonPlaceOrder).click();
    }
}
