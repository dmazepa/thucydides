package com.mycompany

import com.mycompany.steps.GuestSteps
import com.mycompany.requirements.Application.CreateAccount.FromHomePage
using "thucydides"


thucydides.uses_steps_from GuestSteps
thucydides.tests_story FromHomePage

    scenario "As guest I can create account from home page", {
        given "guest on home page",{
            guest.is_the_home_page()
        }
        when "the guest create account",{
            guest.click_on_SignIn_link()
            guest.click_on_Register_link()
            guest.fill_fields_and_submit()
        }
        then "he can see My Account Page, as sign in customer", {
            guest.assert_created_account()
        }
    }
