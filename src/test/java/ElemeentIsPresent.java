import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Создаь метод который будет проверять присутствует ли элемент на странице.
 * Метод должен возвращать boolean и не падать с ощибкой если элемента нет.
 */
public class ElemeentIsPresent {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void openBrowzer() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @Test
    public boolean isPresent() throws InterruptedException {
        driver.get("https://kismia.com/");
        Thread.sleep(3000);
        try {
            driver.findElement(By.cssSelector("#sign-in-form"));
            System.out.println("Element is present");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Element is absent");
            return false;
        }
    }

    @AfterTest
    public void exit() {
        driver.close();
        driver.quit();
    }
}
