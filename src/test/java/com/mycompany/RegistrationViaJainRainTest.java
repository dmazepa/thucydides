package com.mycompany;

import com.mycompany.requirements.Application;
import com.mycompany.steps.GuestSteps;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Registration.EasyRegistration.class)
@RunWith(ThucydidesRunner.class)
public class RegistrationViaJainRainTest {

    @ManagedPages(defaultUrl = "http://localhost:9000")
    public Pages pages;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public GuestSteps guest;

    @Test
    public void as_guest_i_can_create_account() {
        guest.is_the_home_page();
        guest.create_account();
        guest.popup_should_be_present();
    }
} 