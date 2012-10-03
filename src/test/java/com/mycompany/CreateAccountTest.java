package com.mycompany;

import com.mycompany.steps.GuestSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(ThucydidesRunner.class)
public class CreateAccountTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://localhost:9000/dev01/")
    public Pages pages;

    @Steps
    public GuestSteps steps;

    @Test
    public void as_guest_i_can_create_account_from_home_page() {
        //given
        steps.is_the_home_page();
        //when
        steps.click_on_SignIn_link();
        steps.click_on_Register_link();
        steps.fill_fields_and_submit();
        //then
        steps.assert_created_account();
    }
}
