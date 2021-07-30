package qa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaStepsTest {
    @Test
    public void testRepositoryIssueSteps() {

        step("Открываем станицу Github", () ->
                open("https://github.com"));
        step("Ищем  репозиторий", () ->
                $(".header-search-input").setValue("eroshenkoam/allure-example").submit());
        step("Переходим в репозиторий", () ->
            $(linkText("eroshenkoam/allure-example")).click());
        step("Открываем список Issues", () ->
            $(partialLinkText("Issues")).click());
        step("Проверяем наличие Issues с номером 68", () -> {
            $(withText("#68")).should(visible);
        });

    }

}
