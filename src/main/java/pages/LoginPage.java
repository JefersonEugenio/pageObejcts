package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public void preencherEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void preencherSenha(String senha) {
        driver.findElement(passwordField).sendKeys(senha);
    }

    public void clicarLogin() {
        driver.findElement(loginButton).click();
    }

    public void fazerLogin(String email, String senha) {
        preencherEmail(email);
        preencherSenha(senha);
        clicarLogin();
    }
}