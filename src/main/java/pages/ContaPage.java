package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContaPage {

    private WebDriver driver;

    public ContaPage(WebDriver driver){
        this.driver = driver;
    }

    private By nomeUsuarioLogado = By.cssSelector(".header_user_info .account span");
    private By mensagemBoasVindas = By.cssSelector("p.info-account");

    public String obter_NomeUsuarioLogado(){
        return driver.findElement(nomeUsuarioLogado).getText();
    }

    public String obter_MensagemBoasVindas() {
        return driver.findElement(mensagemBoasVindas).getText();
    }
}
