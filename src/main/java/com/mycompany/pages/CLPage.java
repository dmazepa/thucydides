package com.mycompany.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: dmazepa
 * Date: 01.08.12
 * Time: 14:20
 * To change this template use File | Settings | File Templates.
 */
@DefaultUrl("http://localhost:9000/dev01/baby-shower/baby-shower-themes.html")
public class CLPage extends PageObject {

    public CLPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='limiter']/select")
    private WebElement selectItemsPerPage;

    public void assert_12_products() {
       assertThat(element(selectItemsPerPage).getText(),is("12"));
       assertThat(getDriver().findElements(By.xpath("//h2[@class='product-name']")).size(), greaterThanOrEqualTo(12));
    }
}
