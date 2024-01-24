package draggableTests;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class HandlesTest extends Hooks {
    SoftAssertions softAssertions = new SoftAssertions();

    @Test
     public void testForHandlesElements(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDraggableLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnHandlesLink();




        // init values for element1
        int initX1 = pages.getHandlesPage().LocationOfFirstElementX();
        int initY1 = pages.getHandlesPage().LocationOfFirstElementY();

        // apply method

        pages.getHandlesPage().clickAndDragElement1(100,100);

        // final values for element1

        int finalX1 = pages.getHandlesPage().LocationOfFirstElementX();
        int finalY1 = pages.getHandlesPage().LocationOfFirstElementY();

        softAssertions.assertThat(initX1).isLessThan(finalX1);
        softAssertions.assertThat(initY1).isLessThan(finalY1);


        // init values for element2
        int initX2 = pages.getHandlesPage().LocationOfSecondElementX();
        int initY2 = pages.getHandlesPage().LocationOfSecondElementY();

        // apply method

        pages.getHandlesPage().clickAndDragElement2(100,100);

        // final values for element1

        int finalX2 = pages.getHandlesPage().LocationOfSecondElementX();
        int finalY2 = pages.getHandlesPage().LocationOfSecondElementY();

        softAssertions.assertThat(initX2).isLessThan(finalX2);
        softAssertions.assertThat(initY2).isLessThan(finalY2);



    }

}
