package ControlsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * Updated by Shams on 9/21/18.
 */
public class Controls extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\'Standard Switch\']")
    public static WebElement standardSwitchText;

    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\'Standard\']")
    public static WebElement standardSwitchButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\'Standard Slider\']")
    public static WebElement statndardSliderText;

    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\'Standard\']")
    public static WebElement standeardSliderSwitch;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\'Customized Slider\']")
    public static WebElement customizedSliderText;

    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\'Custom\']")
    public static WebElement customizeSiderSwitch;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\'UISlider\'])[1]")
    public static WebElement uiSliderText;

    public void standardSwitchTextisDisplayed(){
        standardSwitchText.isDisplayed();
    }
    public void clickOnStandardSwitch(){
        standardSwitchButton.click();
    }
    public void statndardSliderTextIsDisplayed(){
        statndardSliderText.isDisplayed();
    }
    public void actionStandardSliderSwitch(){
        standeardSliderSwitch.sendKeys("0.3");
    }
    public void customizeSliderTextIsDisplayed(){
        customizedSliderText.isDisplayed();
    }
    public void actionOnCustomizeSliderSwitch(){
        customizeSiderSwitch.sendKeys("0.2");
    }
    public void uiSliderTextIsDisplayed(){
        uiSliderText.isDisplayed();
    }
}
