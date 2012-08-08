package com.mycompany.steps;

import com.mycompany.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created with IntelliJ IDEA.
 * User: dmazepa
 * Date: 01.08.12
 * Time: 14:20
 * To change this template use File | Settings | File Templates.
 */

public class GuestSteps extends ScenarioSteps {

    public GuestSteps(Pages pages) {
        super(pages);
    }

    private HomePage onHomePage() {
        return getPages().currentPageAt(HomePage.class);
    }

    @Step
    public void is_the_home_page() {
        onHomePage().open();
    }

    @Step
    public void create_account() {
         click_sign_in();
    }

    @Step
    private void click_sign_in() {
        onHomePage().click_sign_in();
    }

    @Step
    public void popup_should_be_present() {
        onHomePage().assert_popup_janrain();
    }
}
