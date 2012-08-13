package com.mycompany

import com.mycompany.steps.GuestSteps
import com.mycompany.requirements.Application.Global_Header.SignIn
using "thucydides"


thucydides.uses_steps_from GuestSteps
thucydides.tests_story SignIn

    scenario "Clicking on Sign In link, as guest redirects to the Login Page", {
        given "guest on home page",{
            guest.is_the_home_page()
        }
        when "the guest click on Sign In link", {
            guest.click_on_SignIn_link()
        }
        then "he get account",{
            guest.guest_should_be_redirects_to_Login_page()
        }
    }
