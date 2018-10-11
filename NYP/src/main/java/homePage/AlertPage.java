package homePage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.WeakHashMap;

public class AlertPage extends Base {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\'Navigate up\']")
    public static WebElement backArrow;

    @FindBy(id = "br.com.golmobile.nypost:id/title")
    public static WebElement alertText;

    @FindBy(id = "br.com.golmobile.nypost:id/check_preference_name")
    public static WebElement breakingNewsText;

    @FindBy(id = "br.com.golmobile.nypost:id/preferences_check")
    public static WebElement breakingNewsAlertSwitch;

    @FindBy(id = "br.com.golmobile.nypost:id/check_preference_name")
    public static WebElement nyMetroText;

    @FindBy(id = "br.com.golmobile.nypost:id/preferences_check")
    public static WebElement nyMetroAlertSwitch;

    @FindBy(id = "br.com.golmobile.nypost:id/preferences_check")
    public static WebElement sportsAlertSwitch;

    @FindBy(id = "br.com.golmobile.nypost:id/check_preference_name")
    public static WebElement sportsText;

    @FindBy(id = "br.com.golmobile.nypost:id/check_preference_name")
    public static WebElement editorsPicksText;

    public void tapOnBackArrow(){
        backArrow.click();
    }
    public void showAlertText(){
        alertText.isDisplayed();
    }
    public void showBreakingNewsText(){
        breakingNewsText.isDisplayed();
    }
    public void enableAlertForBreakingNews(){
        breakingNewsAlertSwitch.click();
    }
    public void enableAlertForNYmetro(){
        nyMetroAlertSwitch.click();
    }
    public void checkNYmetroText(){
        nyMetroText.isDisplayed();
    }
    public void showSportsText(){
        sportsText.isDisplayed();
    }
    public void enableSportAlert(){
        sportsAlertSwitch.click();
    }
    public void showEditorsPickText(){
        editorsPicksText.isDisplayed();
    }
}
