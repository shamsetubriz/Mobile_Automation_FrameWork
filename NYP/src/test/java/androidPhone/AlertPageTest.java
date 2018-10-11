package androidPhone;

import homePage.AlertPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertPageTest extends AlertPage {
    AlertPage alertPage;

    @BeforeMethod
    public void alertPage(){
        AlertPage alertPage = PageFactory.initElements(ad, AlertPage.class);
    }

    @Test
    public void testBackArrowButton(){
        alertPage.tapOnBackArrow();
    }

}
