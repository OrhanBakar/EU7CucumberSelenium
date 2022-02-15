package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @Given("the user is in the login page")
    public void the_user_is_in_the_login_page() {
        System.out.println("I opened the browser and navigated to vytrack login page");

    }

    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        System.out.println("the user navigates to Fleet, Vehicles");

    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("The user should see the Title as Vehicles");

    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        System.out.println("The user should navigate to Marketing,Campaigns");

    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("The user should be on the Campaign page");

    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("The user should be able to navigate to Activities, Calendar Events");

    }

    @Then("the title should be Calendars")
    public void the_title_should_be_Calendars() {
        System.out.println("The title should be Calendars");

    }
    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        System.out.println("tab = " + tab);
        System.out.println("module = " + module);
        new DashboardPage().navigateToModule(tab,module);
    }


    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {

        ContactsPage contactsPage=new ContactsPage();
        contactsPage.waitUntilLoaderScreenDisappear();
        Integer actualNumber=Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(expectedPageNum,actualNumber);
    }

    }



