import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IssuesPage extends BasePage {

    public IssuesPage(WebDriver driver) {
        super(driver);
    }

    public void newIssueBtn() throws InterruptedException {
        WebElement newIssueBtn = driver.findElement(By.xpath("//a[@href='/HW10Test/TEST/issues/new/choose' and @class='btn btn-primary' and @role='button' and @data-hotkey='c']"));
        newIssueBtn.click();
        Thread.sleep(2500);
    }
    public void newIssuesNameField(String text) throws InterruptedException {
        WebElement newIssuesNameField = driver.findElement(By.xpath("//*[@id=\"issue_title\"]"));
        webDriverWait = new WebDriverWait(driver, Duration.ofMillis(5000));
        newIssuesNameField.sendKeys(text);
        Thread.sleep(2500);
    }

    public void newIssueTextArea() throws InterruptedException {
        WebElement newIssueTextArea = driver.findElement(By.xpath("//*[@id=\"issue_body\"]"));
        webDriverWait = new WebDriverWait(driver, Duration.ofMillis(5000));
        newIssueTextArea.sendKeys("TEXT AREA TEXT");
        Thread.sleep(2500);
    }

    public void newIssueSubmitBtn() throws InterruptedException {
        WebElement newIssueSubmitBtn = driver.findElement(By.xpath("//*[@id=\"new_issue\"]/div/div/div[1]/div/div[1]/div/div[2]/button"));
        newIssueSubmitBtn.click();
        Thread.sleep(3500);
    }

    public void comentToNewIssue(String yourComent) throws InterruptedException {
        WebElement comentToNewIssue = driver.findElement(By.xpath("//*[@id=\"new_comment_field\"]"));
        comentToNewIssue.sendKeys(yourComent);
        Thread.sleep(3500);
    }

    public void comentSubmitBtn() throws InterruptedException {
        WebElement comentSubmitBtn = driver.findElement(By.xpath("//*[@id=\"partial-new-comment-form-actions\"]/div/div[2]/button"));
        comentSubmitBtn.click();
        Thread.sleep(3500);
    }

    public void plusLabel() throws InterruptedException {
        WebElement labelMenu = driver.findElement(By.xpath("//*[@id=\"labels-select-menu\"]/summary"));
        labelMenu.click();
        Thread.sleep(2500);
        WebElement labelBug = driver.findElement(By.xpath("//*[@id=\"labels-select-menu\"]/details-menu/div[3]/div/form/div/label[1]"));
        labelBug.click();
        labelBug.sendKeys(Keys.ESCAPE);
        Thread.sleep(2500);
    }

    public void addAssignee() throws InterruptedException {
        WebElement assigneeMenu = driver.findElement(By.xpath("//*[@id=\"assignees-select-menu\"]/summary"));
        assigneeMenu.click();
        Thread.sleep(2500);
        WebElement assigneeSuggestionChoose = driver.findElement(By.xpath("//*[@id=\"assignees-select-menu\"]/details-menu/div[2]/div[3]/div[2]/label"));
        assigneeSuggestionChoose.click();
        assigneeMenu.sendKeys(Keys.ESCAPE);
        Thread.sleep(2500);
    }

    public void deleteIssue() throws InterruptedException {
        WebElement deleteIssuesBtn = driver.findElement(By.xpath("//*[@id=\"partial-discussion-sidebar\"]/div[9]/details/summary\n"));
        deleteIssuesBtn.click();
        Thread.sleep(2500);
        WebElement approveDeleteBtn = driver.findElement(By.xpath("//button[@type='submit' and @name='verify_delete' and @value='1' and contains(text(),'Delete this issue')]"));
        approveDeleteBtn.click();
        Thread.sleep(7000);
    }
}




