package tutorialsninja.testsuite;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tutorialsninja.customlisteners.CustomListeners;
import tutorialsninja.pages.DesktopPage;
import tutorialsninja.pages.HomePage;
import tutorialsninja.pages.LaptopsAndNotebooksPage;
import tutorialsninja.pages.MyAccountsPage;
import tutorialsninja.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class MyAccountsPageTest extends BaseTest {
    MyAccountsPage myAccountsPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        myAccountsPage = new MyAccountsPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.clickOnRegisterLink();
        //  myAccountsPage.verifyRegisterAccount();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.clickOnLoginLink();
        //  myAccountsPage.verifyReturnCustomer();

    }

}
