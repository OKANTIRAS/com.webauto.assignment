package selectableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

public class SerializeTest extends Hooks {

    @Test
    void serializeTest(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnSelectableLink();
        pages.getWebAutomationPage().clickSerializeLink();
        JSUtils.executeJavaScript("window.scroll(0,350)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pages.getSerializePage().clickOnlyOneElement(1);
        Assertions.assertEquals("You've selected: #1", pages.getSerializePage().getInformation());

        pages.getSerializePage().clickWithCtrlKeyAndSelectMoreThanOne(3,4,6);
        Assertions.assertEquals("You've selected: #3 #4 #6", pages.getSerializePage().getInformation());

        pages.getSerializePage().selectPressingMouseAndSelectMoreThanOne(2,4);
        BrowserUtils.wait(2);
        Assertions.assertEquals("You've selected: #2 #3 #4", pages.getSerializePage().getInformation());


    }
}
