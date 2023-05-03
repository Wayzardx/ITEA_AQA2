import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    WebElement signInButton = driver.findElement(By.xpath("//a[@href='/login']"));

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public LoginPage goToLoginPage() throws InterruptedException {
        signInButton.click();
        Thread.sleep(2500);
        return new LoginPage(driver);
    }
}
