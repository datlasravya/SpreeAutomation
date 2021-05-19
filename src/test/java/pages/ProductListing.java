package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListing extends Header{
    private  WebDriver driver;
    public ProductListing(WebDriver driver, WebDriverWait wait) {
        super(driver);
        this.driver = driver;
    }

}