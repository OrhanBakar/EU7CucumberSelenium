package com.vytrack.pages;


import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;



public class CalendarEventsPage extends BasePage {


    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(css = "input[type='number']")
    public WebElement page;

    @FindBy(css=".btn-group.actions-group>div")
    public WebElement options;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement pageNumber;

    @FindBy(xpath = "//button[contains(text(),'25')]")
    public WebElement viewPerPage;

    @FindBy(xpath = "(//div[@class='pagination pagination-centered']/label)[3]")
    public WebElement numberOfCalendarEvents;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']/input")
    public WebElement title;

    @FindBy(xpath = "//td[contains(text(),'Testers meeting')]")
    public WebElement testersMeeting;

    @FindBy(xpath = "//h1[contains(text(),'Testers meeting')]")
    public WebElement testersMeetingSub;

    @FindBy(xpath = "//label[contains(text(),'Total of')]")
    public WebElement records;

    @FindBy(css="button [type='checkbox']")
    public WebElement topCheckBox;

    @FindBy(xpath="//table/tbody/tr")
    public List<WebElement> rows;


    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public String numberOfCalendarEventsRecord(){

        List<String> list = Arrays.asList(numberOfCalendarEvents.getText().split(" "));
        return list.get(2);
    }

}
