package tutorialsninja.testsuite;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tutorialsninja.customlisteners.CustomListeners;
import tutorialsninja.pages.DesktopPage;
import tutorialsninja.pages.HomePage;
import tutorialsninja.pages.MyAccountsPage;
import tutorialsninja.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class TopMenuPageTest extends BaseTest {
    MyAccountsPage myAccountsPage;
    HomePage homePage;
    DesktopPage desktopPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        desktopPage = new DesktopPage();
        myAccountsPage = new MyAccountsPage();
        homePage = new HomePage();

    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
//        1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverAndClick();


//        1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.clickOnShowAllDesktopButton();


        //  1.3 Verify the text ‘Desktops’
        Assert.assertEquals("Desktops", "Desktops");


    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

//        2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        desktopPage.setMouseHoverOnLapTopAndNotebookTab();


//        2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        desktopPage.setClickOnLapTopAndNotebookTab();


//        2.3 Verify the text ‘Laptops & Notebooks’
        Assert.assertEquals("Laptops & Notebooks", "Laptops & Notebooks");

    }

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

//        3.1 Mouse hover on “Components” Tab and click7
        desktopPage.setMouseHoverOnComponentTab();

//        3.2 call selectMenu method and pass the menu = “Show All Components”
        desktopPage.setClickOnAllComponentTab();


//        3.3 Verify the text ‘Components’
        Assert.assertEquals("Components", "Components");

    }

}
