package com.mycompany;

import com.mycompany.steps.GuestSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithDriver;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(ThucydidesRunner.class)
public class ShopFlowTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://localhost:9000/dev01/")
    public Pages pages;

    @Steps
    public GuestSteps steps;

    @Test
    @WithDriver("iexplorer")
    public void slider() throws InterruptedException {
        //given
        steps.is_the_home_page();
        //when
        //then
        steps.assert_sliding_of_promotional();
    }

    @Test
    public void products_should_shows_on_CLP_default(){
        //given
        steps.is_the_CLP();
        //when
        //then
        steps.assert_12_products();
    }

    @Test
    public void quick_view_pop_up(){
        //given
        steps.is_the_CLP();
        //when
        steps.move_mouse_to_the_first_product_image();
        //then
        steps.assert_quick_view_button_appears();
        //and
        steps.assert_pop_up_window_appears();
    }
}
