package droppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.JSUtils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AcceptTest extends Hooks {
    @Test

    public void acceptTest(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDroppableLink();
        pages.getWebAutomationPage().clickOnAcceptLink();
        JSUtils.executeJavaScript("window.scroll(0,400)");

        //clickAndDropWebElement1
        pages.getAcceptPage().dragAndDropElement1();
        //verify
        String absoluteClass = pages.getAcceptPage().getClassAttributeOfWebElement3();
        assertFalse(absoluteClass.contains("ui-state-highlight"),"We should not have dropped in this element");

        //WebElement2
        pages.getAcceptPage().dragAndDropElement2();
        absoluteClass = pages.getAcceptPage().getClassAttributeOfWebElement3();
        assertTrue(absoluteClass.contains("ui-state-highlight"),"We should have dropped in there");



    }
}
