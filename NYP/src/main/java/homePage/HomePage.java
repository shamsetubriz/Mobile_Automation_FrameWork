package homePage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base{
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\'Open menu\']")
    public static WebElement menuLink;

    @FindBy(id = "//android.widget.TextView[@content-desc=\'Turn On Notifications\']")
    public static WebElement bellButton;

    @FindBy(id = "br.com.golmobile.nypost:id/logo_header")
    public static WebElement headerNewYorkPost;

    @FindBy(id = "br.com.golmobile.nypost:id/toolbar")
    public static WebElement headerBackGroundField;


    public void tapOnMenuLinkl(){
        menuLink.click();
    }

    public void tapOnBellButton(){
        bellButton.click();
    }
    public void showTheHeader(){
        headerNewYorkPost.isDisplayed();
    }
    public void checkHeaderBackGround(){
        headerBackGroundField.isDisplayed();
    }
}
