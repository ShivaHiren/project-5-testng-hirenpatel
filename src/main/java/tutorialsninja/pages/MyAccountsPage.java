package tutorialsninja.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import tutorialsninja.customlisteners.CustomListeners;
import tutorialsninja.utility.Utility;

public class MyAccountsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccount;

    @CacheLookup
    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returnCustomer;

    public void clickOnMyAccountLink() {
        Reporter.log("Click on my account link " + myAccountLink.toString());
        clickOnElement(myAccountLink);
        CustomListeners.test.log(Status.PASS, "Click on my account link ");
    }

    public void clickOnRegisterLink() {
        Reporter.log("Click on my register link " + registerLink.toString());
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, " Click on my register link ");
    }


    public void clickOnLoginLink() {
        Reporter.log("Click on my login link " + loginLink.toString());
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, " Click on my login link ");
    }


}
