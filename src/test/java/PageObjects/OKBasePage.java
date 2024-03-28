package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;

public class OKBasePage {
    public void checkCondition(SelenideElement element) {
        element.shouldBe(visible);
        element.shouldBe(exist);
    }

    public void clickElement(SelenideElement element) {
        checkCondition(element);
        element.click();
    }

    public void typeTextToTextField(SelenideElement textField, String text) {
        clickElement(textField);
        textField.sendKeys(text);
    }
}
