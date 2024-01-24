package controlGroupTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

public class ToolbarTest extends Hooks {
    @Test
    void testToolbarTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        JSUtils.executeJavaScript("window.scroll(0,300)");
        BrowserUtils.wait(2);

        pages.getWebAutomationPage().clickControlGroupLink();
        pages.getWebAutomationPage().clickToolBar();

        pages.getToolbar().selectZoom("100%");
        Assertions.assertTrue(pages.getToolbar().checkZoomRate("100%"));

        pages.getToolbar().selectBackgroundColour("Red");
        Assertions.assertTrue(pages.getToolbar().checkTextColour("red"));

        pages.getToolbar().clickOnItalicButton();
        Assertions.assertTrue(pages.getToolbar().checkIsItalic());
    }
}
