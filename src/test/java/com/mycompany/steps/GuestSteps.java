package com.mycompany.steps;

import com.mycompany.pages.*;
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

    public HomePage onHomePage() {
        return getPages().currentPageAt(HomePage.class);
    }

    public LoginPage onLoginPage() {
        return getPages().currentPageAt(LoginPage.class);
    }

    public CreateAnAccountPage onCreateAnAccountPage() {
        return getPages().currentPageAt(CreateAnAccountPage.class);
    }

    public MyAccountPage onMyAccountPage() {
        return getPages().currentPageAt(MyAccountPage.class);
    }

    public ProductDetailPage onProductDetailPage() {
        return getPages().currentPageAt(ProductDetailPage.class);
    }

    public CartPage onCartPage() {
        return getPages().currentPageAt(CartPage.class);
    }

    public CheckoutPage onCheckoutPage() {
        return getPages().currentPageAt(CheckoutPage.class);
    }

    public OrderConfirmationPage onOrderConfirmationPage() {
        return getPages().currentPageAt(OrderConfirmationPage.class);
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
    public void fill_fields_and_submit() {
        fill_field_first_name();
        fill_field_last_name();
        fill_field_email();
        fill_field_password();
        fill_field_confirm_password();
        click_button_submit();
    }

    @Step
    public void fill_field_email() {
        onCreateAnAccountPage().fill_field_email();
    }

    @Step
    public void click_button_submit() {
        onCreateAnAccountPage().click_button_submit();
    }

    @Step
    public void fill_field_confirm_password() {
        onCreateAnAccountPage().fill_field_confirm_password();
    }

    @Step
    public void assert_created_account() {
        onMyAccountPage().assert_created_account();
    }

    @Step
    public void is_the_product_page_id(String id) {
        onProductDetailPage().openID(id);
    }

    @Step
    public void add_to_cart_product() {
        onProductDetailPage().click_add_to_cart();
    }

    @Step
    public void passing_checkout_process() {
        go_to_checkout_page();
        choose_checkout_as_guest();
        click_button_continue();
        fill_first_name_field();
        fill_last_name_field();
        fill_email_field();
        fill_address_field();
        fill_city_field();
        select_state();
        fill_postal_code_field();
        fill_telephone_field();
        click_button_continue1();
        click_button_continue2();
        click_input_credit_cart();
        fill_cart_name_field();
        select_cart_type();
        fill_cart_number_field();
        select_month();
        select_year();
        fill_verification_number_field();
        click_button_continue3();
        click_button_place_order();
    }

    @Step
    public void click_button_place_order() {
        onCheckoutPage().click_button_place_order();
    }

    @Step
    public void click_button_continue3() {
        onCheckoutPage().click_button_continue3();
    }

    @Step
    public void fill_verification_number_field() {
        onCheckoutPage().fill_verification_number_field();
    }

    @Step
    public void select_year() {
        onCheckoutPage().select_year();
    }

    @Step
    public void select_month() {
        onCheckoutPage().select_month();
    }

    @Step
    public void fill_cart_number_field() {
        onCheckoutPage().fill_cart_number_field();
    }

    @Step
    public void select_cart_type() {
        onCheckoutPage().select_cart_type();
    }

    @Step
    public void fill_cart_name_field() {
        onCheckoutPage().fill_cart_name_field();
    }

    @Step
    public void click_input_credit_cart() {
        onCheckoutPage().click_on_credit_cart_input();
    }

    @Step
    public void click_button_continue2() {
        onCheckoutPage().click_on_continue_button2();
    }

    @Step
    public void click_button_continue1() {
        onCheckoutPage().click_on_continue_button1();
    }

    @Step
    public void fill_telephone_field() {
        onCheckoutPage().fill_telephone_field();
    }

    @Step
    public void fill_postal_code_field() {
        onCheckoutPage().fill_postal_code_field();
    }

    @Step
    public void select_state() {
        onCheckoutPage().select_state();
    }

    @Step
    public void fill_city_field() {
        onCheckoutPage().fill_city_field();
    }

    @Step
    public void fill_address_field() {
        onCheckoutPage().fill_address_field();
    }

    @Step
    public void fill_email_field() {
        onCheckoutPage().fill_email_field();
    }

    @Step
    public void fill_last_name_field() {
        onCheckoutPage().fill_last_name_field();
    }

    @Step
    public void click_button_continue() {
        onCheckoutPage().click_on_continue_button();
    }

    @Step
    public void choose_checkout_as_guest() {
        onCheckoutPage().choose_checkout_as_guest();
    }

    public void fill_first_name_field() {
        onCheckoutPage().fill_first_name_field();
    }

    @Step
    public void go_to_checkout_page() {
        onCartPage().click_on_checkout_button();
    }

    @Step
    public void is_the_order_confirmation_page() {
        onOrderConfirmationPage().assertOrderConfirmationPage();
    }

    @Step
    public void assert_product_on_confirmation_page() {
        assert_success_messages();
    }

    public void assert_success_messages() {
        onOrderConfirmationPage().assert_success_messages();
    }
}
