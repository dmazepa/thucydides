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
@DefaultUrl("http://localhost:9000/dev01/customer/account/login/")

public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElement fieldEmail;

    @FindBy(xpath = "//div[@class='buttons-set']/button")
    private WebElement buttonRegister;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void shouldHaveElement() {
        shouldBeVisible(fieldEmail);
    }

    public void click_register_button() {
        element(buttonRegister).click();
    }
}
