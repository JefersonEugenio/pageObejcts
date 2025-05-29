package tasks;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginTask {

    private final WebDriver driver;
    private final LoginPage loginPage;

    public LoginTask (WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    public void fazerLogin(String email, String senha) {
        loginPage.getLoginEmailField().sendKeys(email);
        loginPage.getLoginPasswordField().sendKeys(senha);
        loginPage.getLoginButton().click();
    }

}
