package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.TapProject_001.utils.ElementUtils;
import org.testng.Assert;

public class DriverFactoryPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "vehicleLookupButton")
    private WebElement vehicleLookupButton;

    @FindBy(id = "dropdownElement")
    private WebElement dropdownElement;

    @FindBy(id = "alertMessage")
    private WebElement alertMessage;

    @FindBy(id = "headerName")
    private WebElement headerName;

    public DriverFactoryPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }





}