package com.mycompany.steps;

import com.mycompany.pages.HomePage;
import com.mycompany.pages.LoginPage;
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
    public void click_on_SignIn_link() {
        onHomePage().click_sign_in();
    }

    @Step
    public void click_on_my_account_link() {
        onHomePage().click_my_account();
    }

    @Step
    public void guest_should_be_redirects_to_Login_page() {
        LoginPage page = getPages().currentPageAt(LoginPage.class);
        page.shouldHaveElement();
    }
}
