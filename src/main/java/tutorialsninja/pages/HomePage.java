package tutorialsninja.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import tutorialsninja.customlisteners.CustomListeners;
import tutorialsninja.utility.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement mouseHoverAndClick;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
    WebElement clickOnShowDesktopButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
    WebElement clickOnShowAllDesktopButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement clickOnContentButton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement clickOnAddToCartButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement clickOnShoppingCartButton;


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement changeCurrency;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'£ Pound Sterling')]")
    WebElement selectCurrency;


    public void mouseHoverAndClick() {
        Reporter.log("Mouse Hover " + mouseHoverAndClick.toString());
        clickOnElement(mouseHoverAndClick);
        CustomListeners.test.log(Status.PASS, " Mouse hover ");
    }

    public void clickOnShowDesktopButton() {
        Reporter.log("Click on Desktop button " + clickOnShowDesktopButton.toString());
        clickOnElement(clickOnShowDesktopButton);
        CustomListeners.test.log(Status.PASS, " Click on Desktop button ");

    }

    public void clickOnContentButton(By xpath) {
        Reporter.log("Click on button  " + clickOnContentButton.toString());
        clickOnElement(clickOnContentButton);
        CustomListeners.test.log(Status.PASS, " Mouse hover ");
    }

    public void clickOnShowAllDesktopButton() {
        Reporter.log("Click on show all desktop button " + clickOnShowAllDesktopButton.toString());
        clickOnElement(clickOnShowAllDesktopButton);
        CustomListeners.test.log(Status.PASS, " Click on show all desktop button");
    }

    public void clickOnAddToCartButton() {
        Reporter.log("Click on add cart button" + clickOnAddToCartButton.toString());
        clickOnElement(clickOnAddToCartButton);
        CustomListeners.test.log(Status.PASS, " Click on add cart button ");
    }

    public void clickOnShoppingCartButton() {
        Reporter.log("Click on shopping cart button " + clickOnShoppingCartButton.toString());
        clickOnElement(clickOnShoppingCartButton);
        CustomListeners.test.log(Status.PASS, " Click on shopping cart button  ");
    }

    public void changeCurrency() {
        Reporter.log("Click on change currency button " + changeCurrency.toString());
        clickOnElement(changeCurrency);
        CustomListeners.test.log(Status.PASS, " Click on change currency button ");
    }

    public void selectCurrency() {
        Reporter.log("Choose currency " + selectCurrency.toString());
        clickOnElement(selectCurrency);
        CustomListeners.test.log(Status.PASS, " Choose currency ");
    }
}
