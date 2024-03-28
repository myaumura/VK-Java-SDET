package PageObjects;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OKHomePage extends OKBasePage {
    private final SelenideElement navigationBar = $(By.id("topPanel"));
    private final SelenideElement toolBar = $(By.cssSelector(".ucard-mini.toolbar_ucard.js-toolbar-menu.__a11y"));
    private final SelenideElement logoutButton = $(By.cssSelector(".lp"));
    private final ElementsCollection navigationButtons = $$(By.id(".ul.toolbar_nav"));
    private final SelenideElement okLogo = $(By.cssSelector(".toolbar_logo_img"));
    private final SelenideElement vkServices = $(By.cssSelector(".vk_ecosystem_toolbar"));

    public OKHomePage openWithLogin() {
        OKLoginPage okLogin = new OKLoginPage();
        okLogin.open().loginAs("technopol48", "technopolisPassword");
        return this;
    }

    public OKHomePage checkNavigationBar() {
        clickElement(navigationBar);
        return this;
    }

    public OKHomePage checkNavigationButtons() {
        navigationButtons.filterBy(visible);
        return this;
    }

    public OKHomePage checkToolBar() {
        clickElement(toolBar);
        return this;
    }

    public OKHomePage checkOKLogo() {
        checkCondition(okLogo);
        return this;
    }

    public void checkVKServices() {
        checkCondition(vkServices);
        clickElement(vkServices);
    }

    public OKHomePage logout() {
        clickElement(toolBar);
        clickElement(logoutButton);
        return this;
    }
}
