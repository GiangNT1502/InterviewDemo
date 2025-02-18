package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PIMPage;

public class DashboardTest extends BaseTest {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private PIMPage pimPage;

    @BeforeMethod
    public void setupPage() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        pimPage = new PIMPage(driver);
    }

    @Test
    public void loginTest() throws InterruptedException {
        //1.login to the page
        loginPage.loginToDashboard("Admin","admin123");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));

        //2.add employee
        dashboardPage.clickOnPIMTab();
        pimPage.clickOnAddBtn();
        pimPage.addEmployeeInformation();
        pimPage.clickOnButtonSave();
        Assert.assertTrue(pimPage.employeeAddedSuccessfully());

        //3. search
        pimPage.clickOnEmployeeListTab();
        pimPage.clickOnJobTitleDropdown();
        pimPage.selectJob();
//        pimPage.clickOnSearchBtn();
//        pimPage.waitForVisibilityOfElementLocated(By.xpath("//div[contains(@class,'oxd-table-body')]"));

    }
}
