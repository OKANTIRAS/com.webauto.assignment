package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.alerts.ShowAlertPage;
import pages.alerts.ShowConfirmPage;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovementPage;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.HandlesPage;
import pages.droppable.AcceptPage;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.RevertDraggablePositionPage;
import pages.iframe.NestedIframe_Page;
import pages.iframe.NormalIframePage;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.SynchronousResizePage;
import pages.resizable.TextAreaPage;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.SerializePage;

import java.awt.*;

public class Pages {

    private AlertTypes_Page alertTypesPage;

    private Animate_Page animatePage;

    private AutoScrolling_Page autoScrollingPage;

    private Draggable_DefFunc_Page draggableDefFuncPage;

    private Droppable_DefFunc_Page droppableDefFuncPage;

    private HomePage homePage;

    private NestedIframe_Page nestedIframePage;

    private Resizable_DefFunc_Page resizableDefFuncPage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private WebAutomationPage webAutomationPage;

    private ConstrainMovementPage constrainMovementPage;

    private HandlesPage handlesPage;

    private AcceptPage acceptPage;

    private RevertDraggablePositionPage revertDraggablePositionPage;

    private TextAreaPage textAreaPage;

    private SerializePage serializePage;

    private ShowAlertPage showAlertPage;

    private ShowConfirmPage showConfirmPage;

    private NormalIframePage normalIframePage;

    private SynchronousResizePage synchronousResizePage;

    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new NestedIframe_Page();
        alertTypesPage = new AlertTypes_Page();
        animatePage = new Animate_Page();
        constrainMovementPage = new ConstrainMovementPage();
        handlesPage = new HandlesPage();
        acceptPage = new AcceptPage();
        revertDraggablePositionPage = new RevertDraggablePositionPage();
        textAreaPage = new TextAreaPage();
        serializePage = new SerializePage();
        showAlertPage = new ShowAlertPage();
        showConfirmPage = new ShowConfirmPage();
        normalIframePage = new NormalIframePage();
        synchronousResizePage = new SynchronousResizePage();


    }

    public HomePage getHomePage() {
        return homePage;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }

    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }

    public Resizable_DefFunc_Page getResizableDefFuncPage() {
        return resizableDefFuncPage;
    }

    public Selectable_DefFunc_Page getSelectableDefFuncPage() {
        return selectableDefFuncPage;
    }

    public NestedIframe_Page getNestedIframePage() {
        return nestedIframePage;
    }

    public AlertTypes_Page getAlertTypesPage() {
        return alertTypesPage;
    }

    public Animate_Page getAnimatePage() {
        return animatePage;
    }

    public ConstrainMovementPage getConstrainMovementPage() {
        return constrainMovementPage;
    }

    public HandlesPage getHandlesPage(){return handlesPage;}

    public AcceptPage getAcceptPage(){return acceptPage;}

    public RevertDraggablePositionPage getRevertDraggablePositionPage(){return revertDraggablePositionPage;}

    public TextAreaPage getTextAreaPage(){return textAreaPage;}

    public SerializePage getSerializePage(){return serializePage;}

    public ShowAlertPage getShowAlertPage(){return showAlertPage;}

    public ShowConfirmPage getShowConfirmPage(){return showConfirmPage;}

    public NormalIframePage getNormalIframePage() {
        return normalIframePage;
    }

    public SynchronousResizePage getSynchronousResizePage(){return synchronousResizePage;}
}
