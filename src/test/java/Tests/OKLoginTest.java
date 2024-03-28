package Tests;

import PageObjects.OKLoginPage;
import org.junit.jupiter.api.Test;

public class OKLoginTest extends OKBaseTest {
    OKLoginPage okLogin = new OKLoginPage();

    @Test
    public void testLogin() {
        okLogin.open();
        okLogin.typeLogin();
        okLogin.typePassword();
        okLogin.submitLogin();
    }

    @Test
    public void testLoginAs() {
        String login = "technopol48";
        String password = "technopolisPassword";
        okLogin.loginAs(login, password);
    }
}
