package tutorialsninja.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import tutorialsninja.customlisteners.CustomListeners;
import tutorialsninja.utility.Utility;

public class TopMenuPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;


    public String getWelcomeText() {
        Reporter.log("Get welcome text " + welcomeText.toString());
        return getTextFromElement(welcomeText);

    }

    public void enterEmailId(String email) {
        Reporter.log("Enter email " + emailField.toString());
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter email ");
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password " + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter password ");
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on  login button " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on login button ");
    }

    public String getErrorMessage() {
        Reporter.log("Error message " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

}
