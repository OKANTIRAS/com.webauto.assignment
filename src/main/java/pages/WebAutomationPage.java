package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class WebAutomationPage extends BasePage {

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;

    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;

    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;

    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;

    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;

    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;

    @FindBy(linkText = "Animate")
    private WebElement animateLink;

    @FindBy(xpath = "//a[contains(text(),'Constrain Movement')]")
    private WebElement constrainMovementLink;

    @FindBy(xpath = "//a[text()='Handles']")
    private WebElement handlesLink;

    @FindBy(xpath = "//a[text()='Accept']")
    private WebElement acceptLink;

    @FindBy(xpath = "//a[text()='Revert draggable position']")
    private WebElement revertDraggablePositionLink;

    @FindBy(xpath = "//a[text()='Textarea']")
    private WebElement textAreaLink;

    @FindBy(xpath = "//a[text()='Serialize']")
    private WebElement serializeLink;

    @FindBy(xpath = "//a[text()='Normal Iframe']")
    private WebElement normalIframeLink;
    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronusResizeLink;

    @FindBy(xpath = "//a[contains(text(),'Progress Bar')]")
    private WebElement progressBarLink;

    @FindBy(xpath = "//a[contains(text(),'Download Dialog')]")
    private WebElement downloadDialogLink;

    @FindBy(xpath = "//a[contains(text(),'Autocomplete')]")
    private WebElement autocompleteLink;

    @FindBy(xpath = "//a[contains(text(),'Accent Folding')]")
    private WebElement accentFoldingLink;

    @FindBy(linkText = "Menu")
    private WebElement menuLink;

    @FindBy(xpath = "//a[contains(text(),'Icons')]")
    private WebElement iconsLink;

    @FindBy(linkText = "Datepicker")
    private WebElement datePickerLink;

    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRangeLink;

    @FindBy(xpath = "//a[contains(text(),'Control Group')]")
    private WebElement controlGroupLink;

    @FindBy(xpath = "//a[contains(text(),'Toolbar')]")
    private WebElement toolbarLink;

    @FindBy(xpath = "//a[(text()='Dialog')]")
    private WebElement dialogLink;

    @FindBy(xpath = "//a[(text()='Modal Form')]")
    private WebElement modalFormLink;














    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickOnResizableLink() {
        resizableLink.click();
    }

    public void clickOnResizableDefaultFuncLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnSelectableLink() {
        selectableLink.click();
    }

    public void clickOnDefaultFunctionality() {
        defaultFunctionalityLink.click();
    }

    public void clickOnIframeLink() {
        iframeLink.click();
    }

    public void clickOnNestedIframe() {
        nestedIframeLink.click();
    }

    public void clickOnAlertsLink() {
        alertsLink.click();
    }

    public void clickOnAnimateLink() {
        animateLink.click();
    }

    public void clickOnConstrainMovementLink() {
        constrainMovementLink.click();
    }

    public void clickOnHandlesLink() {
        handlesLink.click();
    }

    public void clickOnAcceptLink() {
        acceptLink.click();
    }

    public void clickRevertDraggablePositionLink() {
        revertDraggablePositionLink.click();
    }

    public void clickTextAreaLink() {
        textAreaLink.click();
    }
    public void clickSerializeLink(){
        selectableLink.click();
    }

    public void clickNormalIframeLink(){normalIframeLink.click();}

    public void clickSynchronousResize() {
        synchronusResizeLink.click();
    }

    public void clickProgressBar(){progressBarLink.click();}

    public void clickDownLoadDialogLink(){downloadDialogLink.click();}

    public void clickAutocompleteLink(){autocompleteLink.click();}

    public void clickAccentFoldingLink(){accentFoldingLink.click();}

    public void clickMenuLink(){menuLink.click();}

    public void clickIconsLink(){iconsLink.click();}

    public void clickDatePickerLink(){datePickerLink.click();}

    public void clickSelectDatePickerLink(){selectDateRangeLink.click();}

    public void clickControlGroupLink(){controlGroupLink.click();}

    public void clickToolBar(){toolbarLink.click();}

    public void clickDialogLink(){dialogLink.click();};

    public void clickModalFormLink(){modalFormLink.click();}



}









