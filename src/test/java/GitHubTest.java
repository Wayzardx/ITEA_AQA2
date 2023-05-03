import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GitHubTest extends BaseTest {
    private static final Logger logger = LogManager.getLogger(GitHubTest.class);

    @Test
    public void gitHubTest() throws InterruptedException {
        try {
            logger.info("Test started!");

            HomePage homePage = new HomePage(driver);
            homePage.goToLoginPage();

            LoginPage loginPage = new LoginPage(driver);
            Assertions.assertTrue(loginPage.getLogo().isDisplayed());
            loginPage.successfulLogin("HW10Test", "Nthvbyfnjh219");

            MainPage mainPage = new MainPage(driver);
            mainPage.goToRepositoriesPage();

            RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
            repositoriesPage.goToRepositoriesPage();

            IssuesPage issuesPage = new IssuesPage(driver);
            issuesPage.newIssueBtn();

            IssuesPage issuesPage2 = new IssuesPage(driver);
            issuesPage2.newIssuesNameField("NewTestIssue");

            IssuesPage issuesPage3 = new IssuesPage(driver);
            issuesPage3.newIssueTextArea();

            IssuesPage issuesPage4 = new IssuesPage(driver);
            issuesPage4.newIssueSubmitBtn();

            IssuesPage issuesPage5 = new IssuesPage(driver);
            issuesPage5.comentToNewIssue("YourCommentTEXT");

            IssuesPage issuesPage6 = new IssuesPage(driver);
            issuesPage6.comentSubmitBtn();

            IssuesPage issuesPage7 = new IssuesPage(driver);
            issuesPage7.plusLabel();

            IssuesPage issuesPage8 = new IssuesPage(driver);
            issuesPage8.addAssignee();

            IssuesPage issuesPage9 = new IssuesPage(driver);
            issuesPage9.deleteIssue();

            logger.info("Test completed successfully!");
        } catch (Throwable t) {
            logger.error("TEST FAILED!", t);
            throw t;
        }
    }
}

