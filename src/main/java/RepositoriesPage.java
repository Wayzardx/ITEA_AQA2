import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RepositoriesPage extends BasePage {

    public WebElement issuesBtn = driver.findElement(By.xpath("//a[@id=\"issues-tab\"]"));

    public RepositoriesPage(WebDriver driver) {
        super(driver);
    }

    public IssuesPage goToRepositoriesPage() throws InterruptedException {
        Thread.sleep(2000);
        issuesBtn.click();
        Thread.sleep(2000);
        return new IssuesPage(driver);
    }
}
