package com.mycompany

import com.mycompany.steps.GuestSteps
import com.mycompany.requirements.Application.Registration.EasyRegistration
using "thucydides"


thucydides.uses_steps_from GuestSteps
thucydides.tests_story EasyRegistration

    scenario "As guest i can create account", {
        given "guest on home page",{
            guest.is_the_home_page()
        }
        when "the guest go through create account process", {
            guest.create_account()
        }
        then "he get account",{
            guest.popup_should_be_present()
        }
    }
