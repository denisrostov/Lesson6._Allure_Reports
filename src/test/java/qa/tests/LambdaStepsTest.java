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

    String number = "68";
    String repository = "eroshenkoam/allure-example";

    @Test
    public void testRepositoryIssueSteps() {

        step("Открываем станицу Github", () ->
                open("https://github.com"));
        step("Ищем  репозиторий", (s) -> {
            s.parameter("repository", repository);
            $(".header-search-input").setValue(repository).submit();
        });
        step("Переходим в репозиторий " + repository, () ->
                $(linkText(repository)).click());
        step("Открываем список Issues", () ->
                $(partialLinkText("Issues")).click());
        step("Проверяем наличие Issues с номером " + number, () -> {
            $(withText("#" + number)).should(visible);
        });

    }

}
