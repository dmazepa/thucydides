package com.mycompany.steps;

import com.mycompany.pages.CreateAnAccountPage;
import com.mycompany.pages.HomePage;
import com.mycompany.pages.LoginPage;
import com.mycompany.pages.MyAccountPage;
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

    private LoginPage onLoginPage() {
        return getPages().currentPageAt(LoginPage.class);
    }

    private CreateAnAccountPage onCreateAnAccountPage() {
        return getPages().currentPageAt(CreateAnAccountPage.class);
    }

    private MyAccountPage onMyAccountPage() {
        return getPages().currentPageAt(MyAccountPage.class);
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
        onLoginPage().shouldHaveElement();
    }

    @Step
    public void click_on_Register_link() {
        onLoginPage().click_register_button();
    }

    @Step
    public void fill_field_first_name() {
        onCreateAnAccountPage().fill_field_first_name();
    }

    @Step
    public void fill_field_last_name() {
        onCreateAnAccountPage().fill_field_last_name();
    }

    @Step
    public void fill_field_password() {
        onCreateAnAccountPage().fill_field_password();
    }

    @Step
    public void fill_fields_and_submit() throws InterruptedException {
        fill_field_first_name();
        fill_field_last_name();
        fill_field_email();
        fill_field_password();
        fill_field_confirm_password();
        click_button_submit();
    }

    @Step
    private void fill_field_email() {
         onCreateAnAccountPage().fill_field_email();
    }

    @Step
    private void click_button_submit() {
         onCreateAnAccountPage().click_button_submit();
    }

    @Step
    private void fill_field_confirm_password() {
        onCreateAnAccountPage().fill_field_confirm_password();
    }

    @Step
    private void assert_created_account() {
       onMyAccountPage().assert_created_account();
    }
}
