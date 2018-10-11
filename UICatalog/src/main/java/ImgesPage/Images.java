package ImgesPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Images extends Base {
    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\'Duration\']")
    public static WebElement durationSlider;

    public void durationSliderIsDisplayed(){
        durationSlider.isDisplayed();
    }
}
