package datePickerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

public class SelectDateRangeTest extends Hooks {
    @Test
    void testSelectDateRange(){
        pages.getHomePage().clickOnWebAutomationLink();
        JSUtils.executeJavaScript("window.scroll(0,400)");
        BrowserUtils.wait(2);

        pages.getWebAutomationPage().clickDatePickerLink();

        pages.getWebAutomationPage().clickSelectDatePickerLink();

        pages.getSelectDateRangePage().fromSelectDate("03/03/2024");

        Assertions.assertEquals("03/03/2024",pages.getSelectDateRangePage().getTextFromSelectDate());

        pages.getSelectDateRangePage().toSelectDate("03/04/2024");

        Assertions.assertEquals("03/04/2024",pages.getSelectDateRangePage().getTextToSelectDate());

        BrowserUtils.wait(3);
    }
}
