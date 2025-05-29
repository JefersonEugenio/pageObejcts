package testCases;

import framework.supports.BaseTest;
import framework.webDrivers.DriverManager;
import org.junit.jupiter.api.Test;
import tasks.LoginTask;

public class LoginTest extends BaseTest {

    private final LoginTask loginTask = new LoginTask(DriverManager.getDriver());

    @Test
    public void loginValido() {
        loginTask.fazerLogin("standard_user", "secret_sauce");
    }

}
