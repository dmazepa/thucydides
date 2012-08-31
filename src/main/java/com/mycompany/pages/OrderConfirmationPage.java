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
@DefaultUrl("http://localhost:9000/dev01/checkout/onepage/success/")
public class OrderConfirmationPage extends PageObject {

    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public void assertOrderConfirmationPage() {
        waitForTitleToAppear("Magento Enterprise Edition");
        assertThat(getDriver().getCurrentUrl(), is("https://bdohdev.lcgosc.com/dev01/checkout/onepage/success/"));
    }

    public void assert_success_messages() {
    }
}
