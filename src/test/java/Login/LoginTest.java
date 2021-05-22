package Login;

import Constants.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.Login;

import java.io.IOException;

public class LoginTest extends BaseTest {
    @DataProvider(name = "data")
    public Object[][] userCredentials() {
        return new Object[][]{
                new Object[]{"abcd@abc.com", "neev123"},
                new Object[]{"abcd@abc.com", "neev1234"}
        };
    }

    @Test(dataProvider = "data")
    public void testValidUserCredentials(String uName, String passwd) throws InterruptedException, IOException {
        Login login = new Login(driver);
        login.clickLoginButton();
        login.as(uName, passwd);

    }

}