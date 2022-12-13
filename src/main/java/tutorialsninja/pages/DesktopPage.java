package tutorialsninja.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import tutorialsninja.customlisteners.CustomListeners;
import tutorialsninja.utility.Utility;

import java.util.List;

public class DesktopPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement mouseHoverOnLapTopAndNotebookTab;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
    WebElement clickOnLapTopAndNotebookTab;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement mouseHoverOnComponentTab;

    @CacheLookup
    @FindBy(linkText = "Show All Components")
    WebElement clickOnAllComponentTab;


    public void selectByAtoZ() {
        Reporter.log("It will select order A to Z ");
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (A - Z)");
        CustomListeners.test.log(Status.PASS, "It will select order A to Z ");

    }

    public void selectByIndex() {
        Reporter.log("Selection");
        Select productOrder = new Select(driver.findElement(By.xpath("//select[@id='input-sort']")));
        productOrder.selectByIndex(2);
        CustomListeners.test.log(Status.PASS, "Selection ");
    }

    public void setMouseHoverOnLapTopAndNotebookTab() {
        Reporter.log("Mouse hover " + mouseHoverOnLapTopAndNotebookTab.toString());
        clickOnElement(mouseHoverOnLapTopAndNotebookTab);
        CustomListeners.test.log(Status.PASS, "Mouse hover ");
    }

    public void setClickOnLapTopAndNotebookTab() {
        Reporter.log("Click on laptop and notebook tab " + clickOnLapTopAndNotebookTab.toString());
        clickOnElement(clickOnLapTopAndNotebookTab);
        CustomListeners.test.log(Status.PASS, "Click on laptop and notebook tab ");

    }

    public void setMouseHoverOnComponentTab() {
        Reporter.log("Mouse hover " + mouseHoverOnComponentTab.toString());
        clickOnElement(mouseHoverOnComponentTab);
        CustomListeners.test.log(Status.PASS, "Mouse hover ");
    }

    public void setClickOnAllComponentTab() {
        Reporter.log("Click on all component tab " + clickOnAllComponentTab.toString());
        clickOnElement(clickOnAllComponentTab);
        CustomListeners.test.log(Status.PASS, "Click on all component tab");
    }

    public void dateSelection() {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }

    }
}

