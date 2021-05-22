package Pages;

import Constants.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Constant{
private WebDriver driver;
WebDriverWait wait;

public BasePage(WebDriver driver) {
    this.driver = driver;
    this.wait = new WebDriverWait(driver, Constant.EXPLICIT_WAIT);
}
}