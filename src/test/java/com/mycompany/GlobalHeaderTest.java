
package com.mycompany;

import com.mycompany.requirements.Application;
import com.mycompany.steps.GuestSteps;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Global_Header.SignIn.class)
@RunWith(ThucydidesRunner.class)
public class GlobalHeaderTest {

    @ManagedPages(defaultUrl = "http://localhost:9000")
    public Pages pages;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public GuestSteps guest;



    @Test
    public void click_on_Sign_In_link_as_guest_redirects_to_the_Login_Page() {
        guest.is_the_home_page();
        guest.click_on_SignIn_link();
        guest.guest_should_be_redirects_to_Login_page();
    }

    @Test
    public void click_on_My_account_link_as_guest_redirects_to_the_Login_Page() {
        guest.is_the_home_page();
        guest.click_on_my_account_link();
        guest.guest_should_be_redirects_to_Login_page();
    }
}
