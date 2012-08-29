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
@DefaultUrl("http://localhost:9000/dev01/catalog/product/view/id/91")
public class ProductDetailPage extends PageObject {

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@class='button btn-cart']")
    private WebElement buttonAddToCart;

    public void click_add_to_cart() {
        element(buttonAddToCart).click();
    }
}