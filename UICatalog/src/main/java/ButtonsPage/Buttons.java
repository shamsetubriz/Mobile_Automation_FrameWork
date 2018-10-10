package ButtonsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Updated by Shams.
 */
public class Buttons extends Base {
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\'Gray\']")
    public static WebElement grayButtonBox;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\'Background Image\']")
    public static WebElement backGroudImageText;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    private WebElement imageBtn;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Rounded\"]")
    private WebElement roundedBtn;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    private WebElement backBtn;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\'UIButton\'])[2]")
    public static WebElement uiButtonText;

    public void clickOnGrayButton(){
        grayButtonBox.click();
    }
    public void backGroundImageBoxIsDisplayd(){
        backGroudImageText.isDisplayed();
    }
    public void clickOnImageBtn(){ imageBtn.click();
    }
    public void clickOnRoundedBtn(){
        roundedBtn.click();
    }
    public void clickOnBackBtn(){
        backBtn.click();
    }
    public void uiButtonTextIsDisplayed(){
        uiButtonText.isDisplayed();
    }
}