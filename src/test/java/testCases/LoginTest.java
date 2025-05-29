package testCases;

import framework.supports.BaseTest;
import framework.webDrivers.DriverManager;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    private final LoginPage loginPage = new LoginPage(DriverManager.getDriver());

    @Test
    public void loginValidoTest() {
        loginPage.fazerLogin("standard_user", "secret_sauce");
    }

}