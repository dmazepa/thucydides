package com.mycompany;

import com.mycompany.steps.GlobalSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(ThucydidesRunner.class)
public class ShopFlowTest {

    @Managed (uniqueSession=true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://localhost:9000/dev01/")
    public Pages pages;

    @net.thucydides.core.annotations.Steps
    public GlobalSteps globalSteps;


    @Test
    //@WithDriver("firefox")
    public void slider() throws InterruptedException {
        //given
        globalSteps.is_the_home_page();
        //when
        //then
        globalSteps.assert_sliding_of_promotional();
    }

    @Test
    public void products_should_shows_on_CLP_default() {
        //given
        globalSteps.is_the_CLP();
        //when
        //then
        globalSteps.assert_12_products();
    }

    @Test
    public void quick_view_pop_up() {
        //given
        globalSteps.is_the_CLP();
        //when
        globalSteps.move_mouse_to_the_first_product_image();
        //then
        globalSteps.assert_quick_view_button_appears();
        globalSteps.move_mouse_to_the_first_product_image();
        globalSteps.click_on_quick_view_button();
        //and
        globalSteps.assert_pop_up_window_appears();
    }
}
