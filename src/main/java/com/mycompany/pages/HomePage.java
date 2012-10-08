package com.mycompany.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.StringContains.containsString;

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

    @FindBy(xpath = "//div[@id='slides']/div[2]/div/a")
    private WebElement sliderImage1;

    @FindBy(css = "//div[@class='tlImageContainer']")
    private WebElement sliderImage2;

    public void assert_sliding_of_promotional() throws InterruptedException {
        getDriver().navigate().refresh();
        assertThat(sliderImage2.getAttribute("style"), containsString("none"));
        assertThat(sliderImage1.getAttribute("style"), containsString("none"));
        Thread.sleep(4000);
        assertThat(sliderImage1.getAttribute("style"), containsString("none"));
        assertThat(sliderImage2.getAttribute("style"), containsString("block"));
        Thread.sleep(4000);
        assertThat(sliderImage2.getAttribute("style"), containsString("none"));
        assertThat(sliderImage1.getAttribute("style"), containsString("block"));
    }
}
