package PageObjects;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class OKLoginPage extends OKBasePage {
    private final SelenideElement loginTextField = $(By.id("field_email"));
    private final SelenideElement passwordTextField = $(By.id("field_password"));
    private final SelenideElement loginButton = $(By.cssSelector(".button-pro.__wide"));
    private String login = "technopol48";
    private String password = "technopolisPassword";

    public OKLoginPage open() {
        Selenide.open(Configuration.baseUrl);
        return this;
    }

    public OKLoginPage typeLogin() {
        typeTextToTextField(loginTextField, login);
        return this;
    }

    public OKLoginPage typePassword() {
        typeTextToTextField(passwordTextField, password);
        return this;
    }

    public OKHomePage submitLogin() {
        clickElement(loginButton);
        return new OKHomePage();
    }

    public OKHomePage loginAs(String login, String password) {
        this.login = login;
        this.password = password;
        open();
        typeLogin();
        typePassword();
        return submitLogin();
    }
}
