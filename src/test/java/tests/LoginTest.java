package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    @BeforeMethod
    public void setupPage() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginTest()  {
        loginPage.loginToDashboard("admin@example.com","123456789");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://admin.pixelstrap.net/multikart-admin-rest/dashboard"));


    }
}
