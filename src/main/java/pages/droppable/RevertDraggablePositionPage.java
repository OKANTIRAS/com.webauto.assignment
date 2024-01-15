package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RevertDraggablePositionPage extends BasePage {

    @FindBy(id = "draggable-revert-draggable")
    private WebElement element1;

    @FindBy(id = "draggable2-revert-draggable")
    private WebElement element2;

    @FindBy(id = "droppable-revert-draggable")
    private WebElement element3;

    public void dragAndDropElement1(){
        actions.dragAndDrop(element1,element3).build().perform();
    }
    public void dragAndDropElement2(){
        actions.dragAndDrop(element2,element3).build().perform();
    }
    public int getLocationXOfElement1(){
       return element1.getLocation().getX();
    }
    public int getLocationYOfElement1(){
        return element1.getLocation().getY();
    }
    public int getLocationXOfElement2(){
        return element2.getLocation().getX();
    }
    public int getLocationYOfElement2(){
        return element2.getLocation().getY();
    }






}
