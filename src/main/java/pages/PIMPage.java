package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class PIMPage extends BasePage{

    @FindBy(xpath = "//button[@type='button' and contains(., 'Add')]")
    private WebElement addBtn;

    @FindBy(xpath = "//input[@name='firstName' and contains(@class, 'orangehrm-firstname')]")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveButton;

    @FindBy(xpath ="//h6[text()='Personal Details']")
    private WebElement personalDetails;

    @FindBy(xpath = "//a[text()='Employee List']")
    private WebElement employeeListLink;

    @FindBy(xpath ="//h5[text()='Employee Information']")
    private WebElement employeeInformationHeader;

    @FindBy(xpath ="//label[text()='Job Title']/following::div[contains(@class,'oxd-select-wrapper')]")
    private WebElement jobTitleDropdown;


    @FindBy(xpath ="//div[contains(@class, 'oxd-select-option')]")
    private WebElement jobTitleOption;

    @FindBy(xpath ="//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath ="//div[contains(@class,'oxd-table-body')]")
    private WebElement tableResults;


//    // Wait for the search results to appear (example: waiting for the table body)
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'oxd-table-body')]")));
//
//            System.out.println("Employee added and search by Job Title completed successfully.");

    public PIMPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnAddBtn(){
        click(addBtn);
    }
    public void addEmployeeInformation(){
        waitForElementVisibility(firstNameField);
        firstNameField.sendKeys("TestFirstName");
        lastNameField.sendKeys("TestLastName");
    }

    public void clickOnButtonSave(){
        click(saveButton);
    }

    public boolean employeeAddedSuccessfully(){
        waitForElementVisibility(personalDetails);
        return isElementDisplayed(personalDetails);
    }

    public void clickOnEmployeeListTab(){
        waitForElementVisibility(employeeListLink);
        click(employeeListLink);
    }

    public void clickOnJobTitleDropdown(){
        waitForElementVisibility(employeeInformationHeader);
        click(jobTitleDropdown);
    }
    public void selectJob(){
        waitForElementVisibility(jobTitleOption);
//        click(jobTitleOption);
    }

    public void clickOnSearchBtn(){
        click(searchButton);
    }



}
