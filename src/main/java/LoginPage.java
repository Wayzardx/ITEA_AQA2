import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    final WebElement logo = driver.findElement(By.xpath("//a[@class='header-logo']"));
    final WebElement loginField = driver.findElement(By.xpath("//input[@id='login_field']"));
    final WebElement passwordField = driver.findElement(By.xpath("//input[@type='password' and @name='password']"));
    final WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit' and @name='commit']"));

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return logo;
    }

    public MainPage successfulLogin(String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginBtn.click();
        return new MainPage(driver);

    }
}
