package AlertsPage;

import WebPage.Web;
import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Updated by Shams Muhammad 09/24/18.
 */
public class Alerts extends Base{

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\'Show Simple\'])[1]")
    public static WebElement uiActionSheetShowSimple;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\'Show OK-Cancel\'])[1]")
    public static WebElement uiActionSheetShowOkCancel;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\'Show Customized\']")
    public static WebElement uiActionSheetShowCustomized;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\'Show Simple\'])[2]")
    public static WebElement uiAlerViewShowSimple;

    public void tapUiActionSheetShowSimple(){
        uiActionSheetShowSimple.click();
    }
    public void tapUiActionSheetShowOkCancel(){
        uiActionSheetShowOkCancel.click();
    }
    public void tapUiActionSheetShowCustomized(){
        uiActionSheetShowCustomized.click();
    }
    public void tapUiAlerViewShowSimple(){
        uiAlerViewShowSimple.click();
    }
}
