package com.mycompany.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: dmazepa
 * Date: 01.08.12
 * Time: 14:20
 * To change this template use File | Settings | File Templates.
 */
@DefaultUrl("http://localhost:9000/dev01/customer/account/create/")

public class CreateAnAccountPage extends PageObject {

    public CreateAnAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstname")
    private WebElement fieldFirstName;

    @FindBy(id = "lastname")
    private WebElement fieldLastName;

    @FindBy(id = "password")
    private WebElement fieldPassword;

    @FindBy(id = "confirmation")
    private WebElement fieldConfirmPassword;

    @FindBy(xpath = "//button[@title='Submit']")
    private WebElement buttonSubmit;

    @FindBy(id = "email_address")
    private WebElement fieldEmail;

    public void fill_field_first_name() {
        element(fieldFirstName).clear();
        element(fieldFirstName).type("TestFirstName");
    }

    public void fill_field_last_name() {
        element(fieldLastName).clear();
        element(fieldLastName).type("TestLastName");
    }

    public void fill_field_password() {
        element(fieldPassword).clear();
        element(fieldPassword).type("testthis");
    }

    public void fill_field_confirm_password() {
        element(fieldConfirmPassword).clear();
        element(fieldConfirmPassword).type("testthis");
    }

    public void click_button_submit() {
        element(buttonSubmit).click();
    }

    public void fill_field_email() {
        element(fieldEmail).clear();
        Random random = new Random();
        int f = random.nextInt(2000 - 1000 + 1) + 1000;
        element(fieldEmail).type("tes" + f + "@test.com");
    }
}
