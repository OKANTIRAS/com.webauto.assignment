package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
public class HandlesPage extends BasePage {

    @FindBy(id = "draggable13")
    private WebElement element1;

    @FindBy(id = "draggable14")
    private WebElement element2;

    public int LocationOfFirstElementX(){
        return element1.getLocation().getX();
    }
    public int LocationOfFirstElementY(){
        return element1.getLocation().getY();
    }
    public int LocationOfSecondElementX(){
        return element2.getLocation().getX();
    }
    public int LocationOfSecondElementY(){
        return element2.getLocation().getY();
    }

    public void clickAndDragElement1(int xOffset, int yOffset){
        actions.dragAndDropBy(element1,xOffset,yOffset).release().build().perform();
    }
    public void clickAndDragElement2(int xOffset, int yOffset){
        actions.dragAndDropBy(element2,xOffset,yOffset).release().build().perform();
    }





}
