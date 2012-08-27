package com.mycompany.pages;

import net.thucydides.core.annotations.At;
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
public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElement fieldEmail;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void assertLoginPage() {

    }

    public void shouldHaveElement() {
        shouldBeVisible(fieldEmail);
    }
}
