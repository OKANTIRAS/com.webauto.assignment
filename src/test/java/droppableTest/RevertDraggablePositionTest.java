package droppableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RevertDraggablePositionTest extends Hooks {
    @Test

    public void revertDraggablePositionTest(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDroppableLink();
        pages.getWebAutomationPage().clickRevertDraggablePositionLink();
        JSUtils.executeJavaScript("window.scroll(0,500)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // for element1
        int initX1 = pages.getRevertDraggablePositionPage().getLocationXOfElement1();
        int initY1 = pages.getRevertDraggablePositionPage().getLocationYOfElement1();

        // dragging function
        pages.getRevertDraggablePositionPage().dragAndDropElement1();
        BrowserUtils.wait(2);

        // final location

        int finalX1 = pages.getRevertDraggablePositionPage().getLocationXOfElement1();
        int finalY1 = pages.getRevertDraggablePositionPage().getLocationYOfElement1();

        // verify

        Assertions.assertThat(finalX1).isCloseTo(initX1, Percentage.withPercentage(1));
        Assertions.assertThat(finalY1).isCloseTo(initY1, Percentage.withPercentage(1));

        // for element2
        pages.getRevertDraggablePositionPage().dragAndDropElement2();
        int initX2 = pages.getRevertDraggablePositionPage().getLocationXOfElement2();
        int initY2 = pages.getRevertDraggablePositionPage().getLocationYOfElement2();
        BrowserUtils.wait(2);

        int finalX2 = pages.getRevertDraggablePositionPage().getLocationXOfElement2();
        int finalY2 = pages.getRevertDraggablePositionPage().getLocationYOfElement2();

        Assertions.assertThat(finalX2).isCloseTo(initX2, Percentage.withPercentage(1));
        Assertions.assertThat(finalY2).isCloseTo(initY2, Percentage.withPercentage(1));


    }
}
