package autoCompleteTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccentFoldingPageTest extends Hooks {

    @Test
    void accentFoldingPageTest(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickAutocompleteLink();
        pages.getWebAutomationPage().clickAccentFoldingLink();

        //send value to the input field
        pages.getAccentFoldingPage().sendKeysToText("jo");

        // verify that Jörn Zaefferer and John Resig names is visible

        List<String>actual1 = pages.getAccentFoldingPage().getNames();
        List<String>expected1 =new ArrayList<>(Arrays.asList("Jörn Zaefferer", "John Resig"));

        for(String s : actual1){
            System.out.println(s);
        }
        Assertions.assertEquals(expected1,actual1);

        // clean text input field
        pages.getAccentFoldingPage().cleanDeveloperTextField();

        //send keys again to the input field this time jö
        pages.getAccentFoldingPage().sendKeysToText("jö");
        BrowserUtils.wait(2);

        //verify that when we write jö it is only Jörn Zaefferer is visible
        List<String> actual2 = pages.getAccentFoldingPage().getNames();
        List<String> expected2 = new ArrayList<>(List.of("Jörn Zaefferer"));
        for (String s : actual2) {
            System.out.println(s);
        }
        Assertions.assertEquals(expected2, actual2);
    }
}
