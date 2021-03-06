package models.components.forms_comp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import models.pages.BasePage;

public class ActiveBtnDialogComponent extends BasePage {

    @AndroidFindBy(xpath = "//*[@resource-id='android:id/parentPanel']")
    private MobileElement activeParentPanelElem;
    @AndroidFindBy(id = "android:id/alertTitle")
    private MobileElement dialogTitleElem;
    @AndroidFindBy(id = "android:id/message")
    private MobileElement dialogMessageElem;
    @AndroidFindBy(id = "android:id/button3")
    private MobileElement askMeLaterBtnElem;
    @AndroidFindBy(id = "android:id/button2")
    private MobileElement cancelBtnElem;
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement okBtnElem;

    public ActiveBtnDialogComponent(AppiumDriver<MobileElement> appiumDriver) {
        super(appiumDriver);
    }

    public MobileElement activeParentPanelElem() {
        waitForVisibility(activeParentPanelElem);
        return activeParentPanelElem;
    }

    public MobileElement dialogTitleElem() {
        waitForVisibility(dialogTitleElem);
        return dialogTitleElem;
    }

    public MobileElement dialogMessageElem() {
        waitForVisibility(dialogMessageElem);
        return dialogMessageElem;
    }

    public MobileElement askMeLaterBtnElem() {
        waitForVisibility(askMeLaterBtnElem);
        return askMeLaterBtnElem;
    }

    public MobileElement cancelBtnElem() {
        waitForVisibility(cancelBtnElem);
        return cancelBtnElem;
    }

    public MobileElement okBtnElem() {
        waitForVisibility(okBtnElem);
        return okBtnElem;
    }
}
