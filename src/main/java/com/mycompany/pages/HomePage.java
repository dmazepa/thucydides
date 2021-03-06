package com.mycompany.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.StringContains.containsString;

@DefaultUrl("http://localhost:9000/dev01/")
public class HomePage extends PageObject {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='slides']/div[2]/div/a[1]")
    private WebElement sliderImage1;

    @FindBy(xpath = "//a[@class='prev']")
    private WebElement buttonPrevSlider;

    @FindBy(xpath = "//div[@id='slides']/div[2]/div/a[2]")
    private WebElement sliderImage2;



    public void assert_sliding_of_promotional() throws InterruptedException {
        element(buttonPrevSlider).click();
        System.out.println(sliderImage1.getAttribute("style"));
        System.out.println(sliderImage2.getAttribute("style"));
        assertThat(sliderImage2.getAttribute("style"), containsString("block"));
        assertThat(sliderImage1.getAttribute("style"), containsString("none"));
        Thread.sleep(4000);
        System.out.println(sliderImage1.getAttribute("style"));
        System.out.println(sliderImage2.getAttribute("style"));
        assertThat(sliderImage1.getAttribute("style"), containsString("none"));
        assertThat(sliderImage2.getAttribute("style"), containsString("block"));
    }
}
