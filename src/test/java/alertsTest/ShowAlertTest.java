package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

public class ShowAlertTest extends Hooks {
    @Test

    void showAlertTest(){
        pages.getHomePage().clickOnWebAutomationLink();
        JSUtils.executeJavaScript("window.scroll(0,900)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pages.getWebAutomationPage().clickOnAlertsLink();
        BrowserUtils.scrollUpWithPageUp();
        BrowserUtils.wait(1);
        pages.getAlertTypesPage().clickOnShowAlertButton();
        String actual = pages.getAlertTypesPage().getTextOfTheAlert();
        BrowserUtils.wait(2);
        System.out.println(actual);
        Assertions.assertEquals("This is an alert!",actual,"This is wrong popup");

        pages.getShowAlertPage().clickOnConfirm();



    }
}
