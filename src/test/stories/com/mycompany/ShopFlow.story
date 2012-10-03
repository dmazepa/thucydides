package com.mycompany

import com.mycompany.steps.GuestSteps
import com.mycompany.requirements.Application.ShopFlow.RotatingCarousel
import com.mycompany.requirements.Application.ShopFlow.QtyOfProductsOnCLP
import com.mycompany.requirements.Application.ShopFlow.QuickViewPopUp
using "thucydides"

thucydides.uses_driver "iexplorer"
thucydides.uses_steps_from GuestSteps
thucydides.tests_story RotatingCarousel
thucydides.tests_story QtyOfProductsOnCLP
thucydides.tests_story QuickViewPopUp


    scenario "Promotional slides cycle automatically with a 4 second delay between transitions.",{
        given "guest on Home Page",{
            guest.is_the_home_page()
        }
        when "do nothing"
        then "Promotional slides cycle automatically with a 4 second delay between transitions.",{
            guest.assert_sliding_of_promotional()
        }
    }

     scenario "12 products should shows on CLP default",{
        given "guest on Category Landing Page",{
                guest.is_the_CLP()
            }
            when "do nothing"
            then "12 products shows by default",{
                guest.assert_12_products()
            }
     }

     scenario "Quick view pop-up",{
        given "guest on Category Landing Page",{
            guest.is_the_CLP()
        }
        when "move mouse to product image",{
           guest.move_mouse_to_the_first_product_image()
           guest.assert_quick_view_button_appears()
           guest.click_on_quick_view_button()
        }
        then "pop-up window appears",{
            guest.assert_pop_up_window_appears()
        }
     }