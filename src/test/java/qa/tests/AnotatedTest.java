package qa.tests;

import helpers.Attach;
import org.junit.jupiter.api.Test;

public class AnotatedTest {
    WebSteps steps = new WebSteps();
    String number = "68";
    String repository = "eroshenkoam/allure-example";
    @Test
    public void searchIssueInRepository (){
        steps.openMainPage();
        steps.searchRepository(repository);
        steps.goToRepository(repository);
        steps.openTabIssues();
        Attach.screenshotAs("Issues");
        steps.shouldbeVisibleIssueWithNumber(number);
        Attach.addVideo();
    }
}
