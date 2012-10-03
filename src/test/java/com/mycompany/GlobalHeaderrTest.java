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
public class GlobalHeaderrTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://localhost:9000/dev01/")
    public Pages pages;

    @Steps
    public GuestSteps steps;

    @Test
    public void clicking_on_sign_in_link(){
        //given
        steps.is_the_home_page();
        //when
        steps.click_on_SignIn_link();
        //then
        steps.guest_should_be_redirects_to_Login_page();
    }
    @Test
    public void clicking_on_my_account_link(){
        //given
        steps.is_the_home_page();
        //when
        steps.click_on_my_account_link();
        //then
        steps.guest_should_be_redirects_to_Login_page();
    }
    @Pending @Test
    public void clicking_on_my_account_link_as_customer_redirects_to_the_my_account_page(){
        //given
        //stepscustomer.is_the_home_page();
        //when
        //stepscustomer.click_on_my_account_link();
        //then
        //stepscustomer.customer_should_be_redirects_to_my_account_page();
    }
}
