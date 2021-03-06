package com.mycompany;

import com.mycompany.requirements.Application;
import com.mycompany.steps.GlobalSteps;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Global_Header.UsingLinks.class)
@RunWith(ThucydidesRunner.class)
public class GlobalHeaderTest {

    @Managed (uniqueSession=true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://localhost:9000/dev01/")
    public Pages pages;

    @Steps
    public GlobalSteps globalSteps;


    @Test
    public void clicking_on_sign_in_link() {
        //given
        globalSteps.is_the_home_page();
        //when
        globalSteps.click_on_SignIn_link();
        //then
        globalSteps.guest_should_be_redirects_to_Login_page();
    }

    @Test
    public void clicking_on_my_account_link() {
        //given
        globalSteps.is_the_home_page();
        //when
        globalSteps.click_on_my_account_link();
        //then
        globalSteps.guest_should_be_redirects_to_Login_page();
    }

    @Test
    public void clicking_on_my_account_link_as_customer_redirects_to_the_my_account_page() {
        //given
        globalSteps.is_the_home_page();
        globalSteps.sign_in();
        //when
        globalSteps.click_on_my_account_link();
        //then
        globalSteps.assert_customer_redirects_to_my_account_page();
        globalSteps.click_on_SignOut_link();
    }

    @Test
    public void clicking_on_cart_redirects_to_the_cart_page() {
        //given
        globalSteps.is_the_product_page_id("4325");
        globalSteps.add_to_cart_product();
        //when
        globalSteps.click_on_cart();
        //then
        globalSteps.assert_on_cart_page();
    }

    @Test
    public void on_roll_over_cart_mini_cart_displayed() {
        //given
        globalSteps.is_the_product_page_id("4325");
        globalSteps.add_to_cart_product();
        //when
        globalSteps.roll_over_on_cart();
        //then
        globalSteps.assert_mini_cart_appears();
    }
}
