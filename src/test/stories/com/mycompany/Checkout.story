package com.mycompany

import com.mycompany.steps.GuestSteps
import com.mycompany.requirements.Application.Checkout.AsGuestBundleProduct
using "thucydides"


thucydides.uses_steps_from GuestSteps
thucydides.tests_story AsGuestBundleProduct

    scenario "As guest I can buy bundle product", {
        given "guest on PDP",{
            guest.is_the_product_page_id "91"
        }
        when "the guest add to cart product",{
            guest.add_to_cart_product()
        }
        and "the guest passing checkout process",{
            guest.passing_checkout_process()
        }
        then "he can see Order Confirmation Page with correct data", {
            guest.is_the_order_confirmation_page()
            guest.assert_product_on_confirmation_page()
        }
    }
