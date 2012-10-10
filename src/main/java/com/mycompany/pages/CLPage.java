package com.mycompany.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


@DefaultUrl("http://localhost:9000/dev01/baby-shower/baby-shower-invitations.html")
public class CLPage extends PageObject {


    public CLPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='limiter']/select")
    private WebElement selectItemsPerPage;

    @FindBy(xpath = "//a[@class='product-image']/img")
    private WebElement firstProductImage;

    @FindBy(xpath = "//a[@class='quick-view']")
    private WebElement buttonQuickView;

    @FindBy(xpath = "//div[@class='product-view']")
    private WebElement popUpQuickView;

    @FindBy(xpath = "//div[@class='preloader-mask']")
    private WebElement preloaderQuickView;

    public void assert_12_products() {
        assertThat(element(selectItemsPerPage).getSelectedVisibleTextValue(), is("12"));
        assert (getDriver().findElements(By.xpath("//h2[@class='product-name']")).size() <= 12);
    }

    public void move_mouse_to_the_first_product_image() {
        Locatable hoverItem = (Locatable) firstProductImage;
        Mouse mouse = ((HasInputDevices) getDriver()).getMouse();
        mouse.mouseMove(hoverItem.getCoordinates());
    }

    public void assert_quick_view_button_appears() {
        element(buttonQuickView).shouldBeVisible();
    }

    public void click_on_quick_view_button() {
        element(buttonQuickView).click();
    }

    public void assert_pop_up_window_appears() {
        element(popUpQuickView).waitUntilVisible();
    }
}
