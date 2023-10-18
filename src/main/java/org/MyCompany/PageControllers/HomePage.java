package org.MyCompany.PageControllers;

import org.MyCompany.SeleniumController;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SeleniumController {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "departureAirport")
    public WebElement departureAirportField;

    @FindBy(name = "arrivalAirport")
    public WebElement arrivalAirportField;

    @FindBy(name = "departingDateTime")
    public WebElement departingDateTimeField;

    @FindBy(xpath = "//*[@id=\"tab-1\"]/form/button")
    public WebElement submitButton;
}
