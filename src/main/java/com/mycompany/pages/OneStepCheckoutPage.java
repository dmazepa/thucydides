package com.mycompany.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
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
@DefaultUrl("https://localhost:9000/dev01/checkout/onepage/")
public class OneStepCheckoutPage extends PageObject {

    public OneStepCheckoutPage(WebDriver driver) {
        super(driver);
    }

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

    @FindBy(id = "payment[cc_type]")
    private WebElement inputCreditCart;

    @FindBy(id = "p_method_ccsave")
    private WebElement inputCreditCartVisa;

    @FindBy(id = "billing:telephone")
    private WebElement fieldTelephone;

    @FindBy(id = "authorizenet_cc_cid")
    private WebElement fieldVerificationNumber;

    @FindBy(id = "authorizenet_expiration")
    private WebElement selectMonth;

    @FindBy(id = "authorizenet_expiration_yr")
    private WebElement selectYear;

    @FindBy(id = "authorizenet_cc_number")
    private WebElement fieldCartNumber;

    @FindBy(id = "ccsave_cc_owner")
    private WebElement fieldCartName;

    @FindBy(xpath = "//dl[@class='shipment-methods']//input")
    private WebElement shipment;

    @FindBy(xpath = "//div[@id='payment-buttons-container']/button")
    private WebElement buttonContinue3;

    @FindBy(id = "onestepcheckout-place-order")
    private WebElement buttonPlaceOrder;

    @FindBy(id = "onestepcheckout-place-order-preview")
    private WebElement buttonSubmitOrder;

    public void fill_first_name_field() {
        element(fieldFirstName).type("TestFirstName");
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

    public void click_on_credit_cart_input() {
        element(inputCreditCart).waitUntilVisible();
        element(inputCreditCart).click();
        element(By.xpath("//input[@data-name='Visa']")).shouldBeVisible();
        getDriver().findElement(By.xpath("//input[@data-name='Visa']")).click();
    }

    public void fill_cart_number_field() {
        element(fieldCartNumber).type("4111111111111111");
    }

    public void select_month() {
        element(selectMonth).selectByValue("3");
    }

    public void fill_verification_number_field() {
        element(fieldVerificationNumber).type("111");
    }

    public void select_year() {
        element(selectYear).selectByValue("2022");
    }

    public void click_button_place_order() {
        element(buttonPlaceOrder).click();
    }

    public void click_button_submit_order() {
        element(buttonSubmitOrder).waitUntilVisible();
        element(buttonSubmitOrder).click();
    }

    public void check_sipment() {
        element(shipment).click();
    }
}
