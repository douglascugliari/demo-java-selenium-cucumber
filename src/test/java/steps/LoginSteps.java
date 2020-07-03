package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContaPage;
import pages.HomePage;
import pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LoginSteps {

    private static WebDriver driver;
    private HomePage homePage = new HomePage(driver);
    private LoginPage loginPage;
    private ContaPage contaPage;

    @Before
    public static void start() {
        System.setProperty("webdriver.chrome.driver",
                "src\\drivers\\chrome\\83\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("Im on the login page")
    public void im_on_the_login_page() {
        homePage.carregarPaginaInicial();
        loginPage = homePage.clicarBotaoSignIn();
    }

    @When("I log in with a default user {string} {string}")
    public void i_log_in_with_a_default_user(String userName, String password) {
        loginPage.informarUser(userName);
        loginPage.informarPassword(password);
        contaPage = loginPage.clicarBotaoSignIn();
    }

    @Then("show a welcome message on the site {string}")
    public void show_a_welcome_message_on_the_site(String mensagem) {
        assertThat(contaPage.obter_MensagemBoasVindas(), is(mensagem));
    }

    @Then("show user name {string} on the site")
    public void show_user_name_on_the_site(String nomeUsuarioLogado) {
        assertThat(contaPage.obter_NomeUsuarioLogado(), is(nomeUsuarioLogado));
    }

    @After(order = 0)
    public static void finalizar() {
        driver.quit();
    }
}
