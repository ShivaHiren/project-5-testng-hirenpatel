package tutorialsninja.testbase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tutorialsninja.propertyreader.PropertyReader;
import tutorialsninja.utility.Utility;


public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeBrowser();
    }
}
