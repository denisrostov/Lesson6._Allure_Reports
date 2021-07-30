package qa.tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    public void openMainPage(){
        open("https://github.com");
    }
    public void searchRepository(String repository){
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
    }
    public void goToRepository(){
        $(partialLinkText("Issues")).click();
    }
    public void openTabIssues (String repository){
        $(linkText(repository)).click();
    }
    public void shouldbeVisibleIssueWithNumber (int number){
        $$("div[aria-label='Issues']").findBy(text("#"+number)).shouldBe(visible);
    }
}
