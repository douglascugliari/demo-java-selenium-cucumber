package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By inputUserName = By.id("email");
    private By inputPassword = By.id("passwd");
    private By botaoSignIn = By.id("SubmitLogin");


    public void informarUser(String user){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(inputUserName).clear();
        driver.findElement(inputUserName).sendKeys(user);
    }

    public void informarPassword(String pass){
        driver.findElement(inputPassword).clear();
        driver.findElement(inputPassword).sendKeys(pass);
    }

    public ContaPage clicarBotaoSignIn(){
        driver.findElement(botaoSignIn).click();
        return new ContaPage(driver);
    }
}
