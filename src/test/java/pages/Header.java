package pages;

import contants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header extends BasePage{
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]")
    private WebElement loginMessage;

    public Header(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton(){
        driver.findElement(By.id("link-to-login")).click();
    }
    public String getLoginMessage() throws InterruptedException {
        Thread.sleep(5000);
        //WebDriverWait wait=new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
        //wait.until(ExpectedConditions.visibilityOfAllElements(loginMessage));
        return loginMessage.getText();
    }
    public void clickLogoutAndGetMessage(){
        driver.findElement(By.linkText("Logout")).click();
    }
}