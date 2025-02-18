package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit' and contains(@class, 'orangehrm-login-button')]")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void loginToDashboard(String username,String password) {
       enterText(userName,username);
       enterText(passwordField,password);
       click(loginButton);
       waitForExpectedUrlDisplay("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }
}
