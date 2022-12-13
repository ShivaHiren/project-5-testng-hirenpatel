package tutorialsninja.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import tutorialsninja.customlisteners.CustomListeners;
import tutorialsninja.utility.Utility;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstNameField;


    @CacheLookup
    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailIdField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement phoneNumberField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement passwordConfirmField;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]/input[1]")
    WebElement radioButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
    WebElement privacyPolicy;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]")
    WebElement logOut;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement lastContinueButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(linkText = "Logout")
    WebElement logoutButton;


    public void logoutButton() {
        Reporter.log("Click on  logout button " + logoutButton.toString());
        clickOnElement(logoutButton);
        CustomListeners.test.log(Status.PASS, "Click on logout button ");
    }

    public void loginButton() {
        Reporter.log("Click on login button " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on login button ");
    }

    public void lastContinueButton() {
        Reporter.log("Click on continue button " + lastContinueButton.toString());
        clickOnElement(lastContinueButton);
        CustomListeners.test.log(Status.PASS, "Click on continue button ");
    }

    public void enterFirstNameField(String firstname) {
        Reporter.log("Enter first name " + firstNameField.toString());
        sendTextToElement(firstNameField, firstname);
        CustomListeners.test.log(Status.PASS, "Enter first name");
    }

    public void enterLastNameField(String lastName) {
        Reporter.log("Enter last name " + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
        CustomListeners.test.log(Status.PASS, "Enter last name ");
    }

    public void enterEmailIdField(String emailId) {
        Reporter.log("Enter email " + emailIdField.toString());
        sendTextToElement(emailIdField, emailId);
        CustomListeners.test.log(Status.PASS, "Enter email ");
    }

    public void enterPhoneNumberField(String phoneNumber) {
        Reporter.log("Enter first Phone number" + phoneNumberField.toString());
        sendTextToElement(phoneNumberField, phoneNumber);
        CustomListeners.test.log(Status.PASS, "Enter phone number ");
    }

    public void enterPasswordField(String password) {
        Reporter.log("Enter password" + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter password");
    }

    public void enterPasswordConfirmField(String passwordConfirm) {
        Reporter.log("Re Enter password " + passwordConfirmField.toString());
        sendTextToElement(passwordConfirmField, passwordConfirm);
        CustomListeners.test.log(Status.PASS, "Re Enter password");
    }

    public void clickOnRadioButton() {
        Reporter.log("Click on radio button " + radioButton.toString());
        clickOnElement(radioButton);
        CustomListeners.test.log(Status.PASS, "Click on radio button ");
    }

    public void clickOnPrivacyPolicy() {
        Reporter.log("Click on privacy button " + privacyPolicy.toString());
        clickOnElement(privacyPolicy);
        CustomListeners.test.log(Status.PASS, "Click on privacy button ");
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on continue button " + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on continue button ");
    }

    public void clickOnContinueButtonLink() {
        Reporter.log("Click on continue  link " + continueButtonLink.toString());
        clickOnElement(continueButtonLink);
        CustomListeners.test.log(Status.PASS, "Click on continue link ");
    }

    public void clickOnMyAccountLink() {
        Reporter.log("Click on my account link " + myAccountLink.toString());
        clickOnElement(myAccountLink);
        CustomListeners.test.log(Status.PASS, "Click on my account link ");
    }

    public void clickOnLogOut() {
        Reporter.log("Click on logout " + logOut.toString());
        clickOnElement(logOut);
        CustomListeners.test.log(Status.PASS, "Click on logout ");
    }
}
