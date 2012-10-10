package com.mycompany;

import com.mycompany.steps.CustomerSteps;
import com.mycompany.steps.GuestSteps;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(ThucydidesRunner.class)
public class GlobalHeaderTest {

    @Managed (uniqueSession=true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://localhost:9000/dev01/")
    public Pages pages;

    @Steps
    public GuestSteps guestSteps;
    public CustomerSteps customerSteps;

    @Test
    public void clicking_on_sign_in_link() {
        //given
        guestSteps.is_the_home_page();
        //when
        guestSteps.click_on_SignIn_link();
        //then
        guestSteps.guest_should_be_redirects_to_Login_page();
    }

    @Test
    public void clicking_on_my_account_link() {
        //given
        guestSteps.is_the_home_page();
        //when
        guestSteps.click_on_my_account_link();
        //then
        guestSteps.guest_should_be_redirects_to_Login_page();
    }

    @Pending
    @Test
    public void clicking_on_my_account_link_as_customer_redirects_to_the_my_account_page() {
        //given
        customerSteps.is_the_home_page();
        //when
        //stepscustomer.click_on_my_account_link();
        //then
        //stepscustomer.customer_should_be_redirects_to_my_account_page();
    }
}
