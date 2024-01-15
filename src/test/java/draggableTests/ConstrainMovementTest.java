package draggableTests;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;


public class ConstrainMovementTest extends Hooks {
    SoftAssertions softAssertions = new SoftAssertions();
    @Test

    public void testMovementOfDraggableElements(){

        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnDraggableLink();

        pages.getWebAutomationPage().clickOnConstrainMovementLink();

        BrowserUtils.scrollDownWithPageDown();



        // init values for element1 without dragging

        int initX1= pages.getConstrainMovementPage().firstElementOfLocationX();
        int initY1 = pages.getConstrainMovementPage().firstElementOFLocationY();

        // draggable function is applied

        pages.getConstrainMovementPage().clickAndDragFirstElement(100,100);

        // final values for first element

        int finalX1 = pages.getConstrainMovementPage().firstElementOfLocationX();
        int finalY1 = pages.getConstrainMovementPage().firstElementOFLocationY();

        softAssertions.assertThat(initX1).isEqualTo(finalX1);
        softAssertions.assertThat(initY1).isLessThan(finalY1);

        // init values for element2 withoutdragging

        int initX2 = pages.getConstrainMovementPage().secondElementOfLocationX();
        int initY2 = pages.getConstrainMovementPage().secondElementOfLocationY();

        // draggable function is applied

        pages.getConstrainMovementPage().clickAndDragSecondElement(100,100);

        // final values for second element

        int finalX2 = pages.getConstrainMovementPage().secondElementOfLocationX();
        int finalY2 = pages.getConstrainMovementPage().secondElementOfLocationY();

        softAssertions.assertThat(initX2).isLessThan(finalX2);
        softAssertions.assertThat(initY2).isEqualTo(finalY2);

        // init values for element3 without dragging

        int initX3 = pages.getConstrainMovementPage().thirdElementOfLocationX();
        int initY3 = pages.getConstrainMovementPage().thirdElementOfLocationY();

        // draggable function is applied
        pages.getConstrainMovementPage().clickAndDragThirdElement(100,100);

        // final values for second element

        int finalX3 = pages.getConstrainMovementPage().thirdElementOfLocationX();
        int finalY3 = pages.getConstrainMovementPage().thirdElementOfLocationY();

        softAssertions.assertThat(initX3).isLessThan(finalX3);
        softAssertions.assertThat(initY3).isLessThan(finalY3);

        // init values for element3 without dragging

        int initX4 = pages.getConstrainMovementPage().fourthElementOfLocationX();
        int initY4 = pages.getConstrainMovementPage().fourthElementOfLocationY();

        // draggable function is applied
        pages.getConstrainMovementPage().clickAndDragFourthElement(100,100);

        // final values for second element

        int finalX4 = pages.getConstrainMovementPage().fourthElementOfLocationX();
        int finalY4 = pages.getConstrainMovementPage().fourthElementOfLocationY();

        softAssertions.assertThat(initX4).isLessThan(finalX4);
        softAssertions.assertThat(initY4).isLessThan(finalY4);

















    }


}
