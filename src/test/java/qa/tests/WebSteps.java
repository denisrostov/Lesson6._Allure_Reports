package qa.tests;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {
    @Step("Открываем станицу Github")
    public void openMainPage() {
        open("https://github.com");
    }
    @Step("Ищем  репозиторий {repository}")
    public void searchRepository(String repository) {
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
    }
    @Step("Переходим в репозиторий {repository}")
    public void goToRepository(String repository) {
        $(linkText(repository)).click();
    }
    @Step("Открываем список Issues")
    public void openTabIssues() {
        $(partialLinkText("Issues")).click();
    }
    @Step("Проверяем наличие Issues с номером {number}")
    public void shouldbeVisibleIssueWithNumber(String number) {
        $(withText("#68")).should(visible);
    }
}
