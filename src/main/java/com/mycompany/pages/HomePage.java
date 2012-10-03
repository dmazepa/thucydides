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
@DefaultUrl("http://localhost:9000/dev01/")
public class HomePage extends PageObject {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='slides_container']//a[1]")
    private WebElement sliderImage1;

    @FindBy(xpath = "//div[@class='slides_container']//a[2]")
    private WebElement sliderImage2;

    public void assert_sliding_of_promotional() throws InterruptedException {
        element(sliderImage1).waitUntilVisible();
        element(sliderImage2).shouldNotBeVisible();
        element(sliderImage1).shouldBeVisible();
        Thread.sleep(5000);
        element(sliderImage1).shouldNotBeVisible();
        element(sliderImage2).shouldBeVisible();
    }
}
