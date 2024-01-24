package menu;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IconsTest extends Hooks {
    @Test
    void iconTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        JSUtils.executeJavaScript("window.scroll(0,400)");
        BrowserUtils.wait(2);
        pages.getWebAutomationPage().clickMenuLink();

        pages.getWebAutomationPage().clickIconsLink();

        assertTrue(pages.getIconsPage().isClickable("Save"));





    }
}
