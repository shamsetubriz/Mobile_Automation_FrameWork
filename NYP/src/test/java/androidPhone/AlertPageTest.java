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
    @Test
    public void testShowAlertText(){
        alertPage.showAlertText();
    }
    @Test
    public void testShowBreakingNewsText(){
        alertPage.showBreakingNewsText();
    }
    @Test
    public void testEnableAlertForBreakingNews(){
        alertPage.enableAlertForBreakingNews();
    }
    @Test
    public void testEnableAlertForNYmetro(){
        alertPage.enableAlertForNYmetro();
    }
    @Test
    public void testCheckNYmetroText(){
        alertPage.checkNYmetroText();
    }
    @Test
    public void testShowSportsText(){
        alertPage.showSportsText();
    }
    @Test
    public void testEnableSportAlert(){
        alertPage.enableSportAlert();
    }
    @Test
    public void testShowEditorsPickText(){
        alertPage.showEditorsPickText();
    }

}
