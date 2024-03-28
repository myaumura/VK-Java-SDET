package Tests;

import PageObjects.OKHomePage;
import org.junit.jupiter.api.Test;

public class OKHomeTest extends OKBaseTest {
    OKHomePage homePage = new OKHomePage();

    @Test
    public void testNavigationBar() {
        homePage.openWithLogin();
        homePage.checkNavigationBar();
    }

    @Test
    public void testToolBar() {
        homePage.openWithLogin();
        homePage.checkToolBar();
    }

    @Test
    public void testNavigationButtons() {
        homePage.openWithLogin();
        homePage.checkNavigationButtons();
    }

    @Test
    public void testOKLogo() {
        homePage.openWithLogin();
        homePage.checkOKLogo();
    }

    @Test
    public void testVKServices() {
        homePage.openWithLogin();
        homePage.checkVKServices();
    }

    @Test
    public void testLogout() {
        homePage.openWithLogin();
        homePage.logout();
    }
}
