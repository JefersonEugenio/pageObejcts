package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

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