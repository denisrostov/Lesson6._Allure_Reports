package qa.tests;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    @Test
    @Feature("Issues")
    @Story("Поиск по Issue")
    @Owner("eroshenkoam")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "GitHub", url = "https://github.com")
    @Description(
            "Этот тест нужно бла-бла-бла..."
    )
    @DisplayName("Проверка работы поиска по Issues через Аннотации")
    public void testLabelsWithAnnotations() {

    }

    @Test
    @DisplayName("Проверка работы поиска по Issues через Методы")
    public void testLabelsWithMethods() {
        Allure.feature("Issues");
        Allure.story("Поиск по Issue");
        Allure.label("owner", "eroshenkoam");
        Allure.label("severity", SeverityLevel.BLOCKER.toString());
        Allure.link("GitHub", "https://github.com");
        Allure.description("Этот тест нужно бла-бла-бла...");
    }

}
