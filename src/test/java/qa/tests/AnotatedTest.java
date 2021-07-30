package qa.tests;

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
        steps.shouldbeVisibleIssueWithNumber(number);
    }
}
