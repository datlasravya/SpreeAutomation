package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header extends BasePage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]")
    private WebElement loginMessage;

    public Header(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() {
        driver.findElement(By.id("link-to-login")).click();
    }

    public String getLoginMessage() throws InterruptedException {
        Thread.sleep(5000);
        return loginMessage.getText();
    }

    public void clickLogoutAndGetMessage() {
        driver.findElement(By.linkText("Logout")).click();
    }
}