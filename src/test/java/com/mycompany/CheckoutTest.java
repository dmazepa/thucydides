package com.mycompany;

import com.mycompany.requirements.Application;
import com.mycompany.steps.GlobalSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Checkout.AsGuestBundleProduct.class)
@RunWith(ThucydidesRunner.class)
public class CheckoutTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://localhost:9000/dev01/")
    public Pages pages;

    @net.thucydides.core.annotations.Steps
    public GlobalSteps globalSteps;

    @Test
    public void as_guest_i_can_buy_bundle_product() throws InterruptedException {
        //given
        globalSteps.is_the_product_page_id("51");
        //when
        globalSteps.add_to_cart_product();
        //and
        globalSteps.passing_checkout_process();
        //then
        globalSteps.is_the_order_confirmation_page();
        globalSteps.assert_product_on_confirmation_page();
    }

    @Test
    public void when_add_to_cart_mini_cart_should_appears() throws InterruptedException {
        //given
        globalSteps.is_the_product_page_id("4325");
        //when
        globalSteps.add_to_cart_product();
        //then
        globalSteps.assert_mini_cart_appears();
    }
}
