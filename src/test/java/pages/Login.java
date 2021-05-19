package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends Header{
    private  WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "spree_user_email")
    private WebElement userName;
    @FindBy(id = "spree_user_password")
    private WebElement passWord;
    @FindBy(name = "commit")
    private WebElement loginButton;

    public Login(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void as(String email, String Password) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, contants.Constants.EXPLICIT_WAIT);
        wait.until(ExpectedConditions.elementToBeClickable(userName));
        userName.sendKeys(email);
        passWord.sendKeys(Password);
        loginButton.click();
        if(getLoginMessage().equals("Logged in successfully")){
            System.out.println("Logged in successfully");
        }
        else{
            System.out.println("Invalid User Credentials");
        }
    }

    //    public String logout(){
//        driver.findElement(By.linkText("Logout")).click();
//        String logoutMessage=driver.findElement(By.cssSelector(".")).getText();
//    }
    public void clickOnRememberMe(){

    }

    public void createAccount(){

    }

    public void forgotPassword(){

    }
}