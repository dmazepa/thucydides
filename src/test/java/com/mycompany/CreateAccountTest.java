package com.mycompany;

import com.mycompany.steps.GlobalSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
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

    @net.thucydides.core.annotations.Steps
    public GlobalSteps globalSteps;

    @Test
    public void as_guest_i_can_create_account_from_home_page() {
        //given
        globalSteps.is_the_home_page();
        //when
        globalSteps.click_on_SignIn_link();
        globalSteps.click_on_Register_link();
        globalSteps.fill_fields_and_submit();
        //then
        globalSteps.assert_created_account();
    }
}
