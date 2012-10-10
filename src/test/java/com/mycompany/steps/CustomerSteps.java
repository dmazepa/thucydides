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

public class CustomerSteps extends ScenarioSteps {

    public CustomerSteps(Pages pages) {
        super(pages);
    }

    public HomePage onHomePage() {
        return getPages().currentPageAt(HomePage.class);
    }

    public GlobalHeaderFooterPage onGlobalHeaderFooterPage() {
        return getPages().currentPageAt(GlobalHeaderFooterPage.class);
    }

    @Step
    public void is_the_home_page() {
        onHomePage().open();
        onGlobalHeaderFooterPage().click_sign_in();

    }
}
