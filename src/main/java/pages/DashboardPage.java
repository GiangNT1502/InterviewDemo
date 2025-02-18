package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
    private WebElement pimTab;


    public DashboardPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnPIMTab(){
        click(pimTab);
    }
//    public void clickOnAllProduct(){
//        click(allProduct);
//    }
//
//
//    public List<String> getListProductName() {
//        return produccts.stream()
//                .map(WebElement::getText)
//                .collect(Collectors.toList());
//    }

}
