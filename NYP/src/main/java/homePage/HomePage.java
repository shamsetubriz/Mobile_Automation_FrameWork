package homePage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base{
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\'Open menu\']")
    public static WebElement menuLink;

    public void tapOnMenuLinkl(){
        menuLink.click();
    }
}
