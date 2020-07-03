package base;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class BaseTests {

    private static WebDriver driver;
    protected HomePage homePage;

    @BeforeEach
    public void carregarPaginaInicial() {
        driver.get("https://marcelodebittencourt.com/demoprestashop/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }
}
