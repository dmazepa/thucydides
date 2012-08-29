package com.mycompany

import com.mycompany.steps.GuestSteps
import com.mycompany.requirements.Application.Global_Header.UsingLinks
using "thucydides"


thucydides.uses_steps_from GuestSteps
thucydides.tests_story UsingLinks

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

    scenario "Clicking on My Account link, as guest redirects to the Login Page", {
        given "guest on home page",{
            guest.is_the_home_page()
        }
        when "the guest click on Sign In link", {
            guest.click_on_my_account_link()
        }
        then "he get account",{
            guest.guest_should_be_redirects_to_Login_page()
        }
    }

    scenario "Clicking on My Account link, as customer redirects to the My Account Page", {
        given "customer on home page"
        when "the customer click on My Account link"
        then "he redirects to the My Account Page"
    }

