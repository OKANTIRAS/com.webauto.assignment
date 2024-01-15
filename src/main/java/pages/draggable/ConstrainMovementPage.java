package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ConstrainMovementPage extends BasePage {
    @FindBy(id = "draggable5")
    private WebElement firstDraggableElement;

    @FindBy(id = "draggable6")
    private WebElement secondDraggableElement;

    @FindBy(id = "draggable7")
    private WebElement thirdDraggableElement;

    @FindBy(id = "draggable8")
    private WebElement fourthDraggableElement;

    public void clickAndDragFirstElement(int xOffset, int yOffset){

        actions.clickAndHold(firstDraggableElement)
                .dragAndDropBy(firstDraggableElement,xOffset,yOffset);
    }
    public void clickAndDragSecondElement(int xOffset,int yOffset){
        actions.clickAndHold(secondDraggableElement)
                .dragAndDropBy(firstDraggableElement,xOffset,yOffset);
    }
    public int firstElementOfLocationX(){
        return firstDraggableElement.getLocation().getX();
    }
    public int firstElementOFLocationY(){
        return firstDraggableElement.getLocation().getY();
    }
    public int secondElementOfLocationX(){
        return secondDraggableElement.getLocation().getX();
    }
    public int secondElementOfLocationY(){
        return secondDraggableElement.getLocation().getY();
    }
    //for third draggable

    public void clickAndDragThirdElement(int xOffset,int yOffset){
        actions.dragAndDropBy(thirdDraggableElement,xOffset,yOffset).build().perform();
    }
    public int thirdElementOfLocationX(){
        return thirdDraggableElement.getLocation().getX();
    }
    public int thirdElementOfLocationY(){
        return thirdDraggableElement.getLocation().getY();
    }
    public void clickAndDragFourthElement(int xOffset,int yOffset){
        actions.dragAndDropBy(thirdDraggableElement,xOffset,yOffset).build().perform();
    }
    public int fourthElementOfLocationX(){
        return fourthDraggableElement.getLocation().getX();
    }
    public int fourthElementOfLocationY(){
        return fourthDraggableElement.getLocation().getY();
    }









}
