package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
       String url= ConfigurationReader.get("url");
        //WebDriver driver=Driver.get();
        Driver.get().get(url);
        //Singleton driver sayesinde projenizin her yerinde ayni object i gösterir.
        //Browser Utiliniz Driver.get()lerle dolu olsa bile.
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() throws InterruptedException {

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
        //loginPage in icinde click de var

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard",actualTitle);

    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() throws InterruptedException {

        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);

    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() throws InterruptedException {

        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {

       LoginPage loginPage=new LoginPage();
       loginPage.login(username,password);
    }
    @Then("the title contains {string}")
    public void the_title_contains(String expectetTitle) {
        System.out.println("expectetTitle = " + expectetTitle);
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.get().getTitle().contains(expectetTitle));
    }
    @Given("the user logged in as {string}")

    public void the_user_logged_in_as(String usertype) {

       Driver.get().get(ConfigurationReader.get("url"));
        String username=null;
        String password=null;

       if(usertype.toLowerCase(Locale.ROOT).equals("driver")){

           username=ConfigurationReader.get("driver_username");
           password=ConfigurationReader.get("driver_password");

       }else if(usertype.toLowerCase(Locale.ROOT).equals("salesmanager")){

           username=ConfigurationReader.get("salesmanager_username");
           password=ConfigurationReader.get("salesmanager_password");

       }else if(usertype.toLowerCase(Locale.ROOT).equals("storemanager")){

           username=ConfigurationReader.get("storemanager_username");
           password=ConfigurationReader.get("storemanager_password");
       }
        new LoginPage().login(username,password);

    }


}
