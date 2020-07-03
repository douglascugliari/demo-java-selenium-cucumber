package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;

    private By botaoSign = By.cssSelector(".header_user_info .login");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void carregarPaginaInicial() {
        driver.get("http://automationpractice.com/index.php");
    }

    public LoginPage clicarBotaoSignIn(){
        driver.findElement(botaoSign).click();
        return new LoginPage(driver);
    }
}
