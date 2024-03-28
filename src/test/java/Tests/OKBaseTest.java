package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class OKBaseTest {
    @BeforeEach
    public void setUp() {
        Configuration.baseUrl = "https://ok.ru";
        Configuration.timeout = 1000;
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
