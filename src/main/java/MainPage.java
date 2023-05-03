import org.openqa.selenium.WebDriver;


public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public RepositoriesPage goToRepositoriesPage() {
        driver.get("https://github.com/HW10Test/TEST");
        return new RepositoriesPage(driver);
    }
}
