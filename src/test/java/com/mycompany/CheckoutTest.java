package com.mycompany;

import com.mycompany.steps.GuestSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(ThucydidesRunner.class)
public class CheckoutTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://localhost:9000/dev01/")
    public Pages pages;

    @Steps
    public GuestSteps steps;

    @Pending
    @Test
    public void as_guest_i_can_buy_bundle_product() throws InterruptedException {
        //given
        steps.is_the_product_page_id("91");
        //when
        steps.add_to_cart_product();
        //and
        steps.passing_checkout_process();
        //then
        steps.is_the_order_confirmation_page();
        steps.assert_product_on_confirmation_page();
    }
}
