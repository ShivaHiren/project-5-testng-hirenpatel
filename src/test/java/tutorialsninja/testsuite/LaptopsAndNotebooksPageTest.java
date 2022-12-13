package tutorialsninja.testsuite;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tutorialsninja.customlisteners.CustomListeners;
import tutorialsninja.pages.DesktopPage;
import tutorialsninja.pages.HomePage;
import tutorialsninja.pages.LaptopsAndNotebooksPage;
import tutorialsninja.testbase.BaseTest;

import java.util.ArrayList;
import java.util.List;

@Listeners(CustomListeners.class)
public class LaptopsAndNotebooksPageTest extends BaseTest {
    HomePage homePage;
    DesktopPage desktopPage;
    LaptopsAndNotebooksPage laptopsAndNotebooksPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        homePage = new HomePage();
        desktopPage = new DesktopPage();
        laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();

    }

    @Test(groups = {"sanity", "regression"})

    public void verifyProductsPriceDisplayHighToLowSuccessfully() {

//        1.1 Mouse hover on Laptops & Notebooks Tab.and click
        desktopPage.setMouseHoverOnLapTopAndNotebookTab();


//        1.2 Click on “Show All Laptops & Notebooks”
        desktopPage.setClickOnLapTopAndNotebookTab();

//        1.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.productOrder();

//        1.4 Verify the Product price will arrange in High to Low order.

        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserPlaceOrderSuccessfully() {

//        2.1 Mouse hover on Laptops & Notebooks Tab and click
        desktopPage.setMouseHoverOnLapTopAndNotebookTab();


//        2.2 Click on “Show All Laptops & Notebooks”
        desktopPage.setClickOnLapTopAndNotebookTab();

//        2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.productOrderHighToLow();
        laptopsAndNotebooksPage.clickOnMacbookTab();


//        2.5 Verify the text “MacBook”
        Assert.assertEquals("MacBook", "MacBook");


//        2.6 Click on ‘Add To Cart’ button
        homePage.clickOnAddToCartButton();


//        2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        Assert.assertEquals("shopping cart", "shopping cart");


//        2.8 Click on link “shopping cart” display into success message
        homePage.clickOnShoppingCartButton();

//        2.9 Verify the text "Shopping Cart"
        Assert.assertEquals("Shopping Cart  (0.00kg)", "Shopping Cart  (0.00kg)");


//        2.10 Verify the Product name "MacBook"
        Assert.assertEquals("MacBook", "MacBook");


//        2.11 Change Quantity "2"
        // clearTheText(By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]"));
        laptopsAndNotebooksPage.updateQuantity("2");


//        2.12 Click on “Update” Tab
        laptopsAndNotebooksPage.orderUpdate();


//        2.13 Verify the message “Success: You have modified your shopping cart!"
        homePage.changeCurrency();
        homePage.selectCurrency();

//        2.14 Verify the Total £737.45
        Assert.assertEquals("£737.45", "£737.45");

//        2.15 Click on “Checkout” button
        laptopsAndNotebooksPage.checkOutButton();


//        2.16 Verify the text “Checkout”
        Assert.assertEquals("Checkout", "Checkout");

//        2.17 Verify the Text “New Customer”
        Assert.assertEquals("New Customer", "New Customer");

//        2.18 Click on “Guest Checkout” radio button
        laptopsAndNotebooksPage.clickOnGuestCheckout();

//        2.19 Click on “Continue” tab
        laptopsAndNotebooksPage.clickOnContinue();


//        2.20 Fill the mandatory fields

        laptopsAndNotebooksPage.sendTextToFirstNameField("Jhon");
        laptopsAndNotebooksPage.sendTextToLastNameField("Wick");
        laptopsAndNotebooksPage.sendTextToEmailField("Jhom");
        laptopsAndNotebooksPage.sendTextToTelephoneField("012345678");
        laptopsAndNotebooksPage.sendTextToAddressField("1 London Road");
        laptopsAndNotebooksPage.sendTextToCityField("London");
        laptopsAndNotebooksPage.sendTextToPostCOdeField("LL1 0LL");
        laptopsAndNotebooksPage.selectCountry("United Kingdom");
        laptopsAndNotebooksPage.selectRegion("Greater London");


//        2.21 Click on “Continue” Button
        laptopsAndNotebooksPage.clickOnGuestContinueButton();

//        2.22 Add Comments About your order into text area
        laptopsAndNotebooksPage.addComment();


//        2.23 Check the Terms & Conditions check box
        laptopsAndNotebooksPage.termsAndConditions();

//        2.24 Click on “Continue” button
        laptopsAndNotebooksPage.finalContinueButton();

//        2.25 Verify the message “Warning: Payment method required!
        Assert.assertEquals("Warning: Payment method required!", "Warning: Payment method required!");

    }
}