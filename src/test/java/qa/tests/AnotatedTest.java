package qa.tests;

import org.junit.jupiter.api.Test;

public class AnotatedTest {
    WebSteps steps = new WebSteps();

    @Test
    public void searchIssueIntoRepository (){
        steps.openMainPage();
        steps.searchRepository("eroshenkoam/allure-example");
        steps.goToRepository();
        steps.openTabIssues("eroshenkoam/allure-example");
        steps.shouldbeVisibleIssueWithNumber(68);
    }
}
