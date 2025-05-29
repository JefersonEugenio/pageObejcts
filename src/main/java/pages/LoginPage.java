package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public WebElement getLoginEmailField() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getLoginPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }

}