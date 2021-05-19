package Login;
import constants.BaseTest;
import constants.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login;

import java.io.IOException;

public class LoginTest extends BaseTest {
    @DataProvider(name = "data")
    public Object[][] userCredentials(){
        return new Object[][]{
                new Object[]{"mamta.siyak@thoughtworks.com","mamtasiyak1@"},
                new Object[]{"mamta.siyak@thoughtworks.com","abc"}
        };
    }

    @Test(dataProvider = "data")
    public void testValidUserCredentials(String uName, String passwd) throws InterruptedException, IOException {
        Login login = new Login(driver);
        login.clickLoginButton();
        login.as(uName,passwd);
        //Assert.assertEquals(login.getLoginMessage(),"Logged in successfully","Validate login successful message");
        // String logoutSuccessMessage = login.logout();

    }

}