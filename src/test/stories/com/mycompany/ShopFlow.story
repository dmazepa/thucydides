package com.mycompany

import com.mycompany.steps.GuestSteps
import com.mycompany.requirements.Application.ShopFlow.RotatingCarousel
using "thucydides"


thucydides.uses_steps_from GuestSteps
thucydides.tests_story RotatingCarousel

    scenario "Promotional slides cycle automatically with a 4 second delay between transitions.",{
        given "guest on Home Page",{
            guest.is_the_home_page()
        }
        when "do nothing"
        then "Promotional slides cycle automatically with a 4 second delay between transitions.",{
            guest.assert_sliding_of_promotional()
        }
    }