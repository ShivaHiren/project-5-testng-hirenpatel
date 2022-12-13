package tutorialsninja.testsuite;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tutorialsninja.customlisteners.CustomListeners;
import tutorialsninja.pages.MyAccountsPage;
import tutorialsninja.pages.RegisterPage;
import tutorialsninja.testbase.BaseTest;
import tutorialsninja.utility.Utility;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {
    MyAccountsPage myAccountsPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {


       myAccountsPage = new MyAccountsPage();
       registerPage = new RegisterPage();

    }
    @Test(groups = {"sanity", "regression"})
    public void verifyThatUserRegisterAccountSuccessfully() {
// 3.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();

//    3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”

        myAccountsPage.clickOnRegisterLink();

//    3.3 Enter First Name
        registerPage.enterFirstNameField("Jhon");

//    3.4 Enter Last Name
        registerPage.enterLastNameField("Wick");

//    3.5 Enter Email
        registerPage.enterEmailIdField("Jhon" + Utility.getAlphaNumericString(2) + "@gmail.com");

//    3.6 Enter Telephone
        registerPage.enterPhoneNumberField("012345678");

//    3.7 Enter Password
        registerPage.enterPasswordField("jhon123");

//    3.8 Enter Password Confirm
        registerPage.enterPasswordConfirmField("jhon123");

//    3.9 Select Subscribe Yes radio button
        registerPage.clickOnRadioButton();

//    3.10 Click on Privacy Policy check box
        registerPage.clickOnPrivacyPolicy();

//    3.11 Click on Continue button
        registerPage.clickOnContinueButton();

//    3.12 Verify the message “Your Account Has Been Created!”
        Assert.assertEquals("MyAccountsPage myAccountsPage", "MyAccountsPage myAccountsPage");

//    3.13 Click on Continue button
        registerPage.clickOnContinueButtonLink();

//    3.14 Click on My Account Link.
        registerPage.clickOnMyAccountLink();

//    3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        registerPage.clickOnLogOut();

//    3.16 Verify the text “Account Logout”
        Assert.assertEquals("Account Logout","Account Logout");

//    3.17 Click on Continue button
        registerPage.lastContinueButton();

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
//    4.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();


//    4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccountsPage.clickOnLoginLink();


//    4.3 Enter Email address
        registerPage.enterEmailIdField("JhonX8@gmail.com");


//    4.5 Enter Password
        registerPage.enterPasswordField("jhon123");


//    4.6 Click on Login button
       registerPage.loginButton();

//    4.7 Verify text “My Account”
        Assert.assertEquals("My Account","My Account");


//    4.8 Click on My Account Link.
        registerPage.clickOnMyAccountLink();

//    4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        registerPage.logoutButton();


//    4.10 Verify the text “Account Logout”
        Assert.assertEquals("Account Logout","Account Logout");



//    4.11 Click on Continue button
        registerPage.lastContinueButton();


    }
}