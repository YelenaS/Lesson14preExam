import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.testng.Assert.assertTrue;

/**
 * Зайти на imdb top 250. - собрать весь список фильмов в List. -
 * Удалить из списка фильмы с оценкой больше 9 и меньше 8.5.
 */
public class ImbdTop250 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void autorizationInVK() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.get("http://www.imdb.com/chart/top");
        List<String> films = new ArrayList<>();

        List<WebElement> elements = driver.findElements(By.xpath(".//*[@id='main']/div/span/div/div/div[3]/table/tbody/tr"));
        String filmName;

        for (WebElement element : elements) {
            filmName = element.getText();
            films.add(filmName);
            // System.out.println(filmName);
        }
        List<String> collect = films.stream().filter(s -> s.contains("8,5")).collect(Collectors.toList());
        for (String element : collect) {
            System.out.println(element);
        }

    /*    Pattern pat = Pattern.compile("[8-9]{1}\\,[0-9]{1}\"); // БЕЗУСПЕШНЫЕ ПОПЫТКИ :-(
        Iterator<String> iterator = films.iterator();
        {
            Matcher matcher;
            double rating;
            while (iterator.hasNext()) {
                matcher = pat.matcher(iterator.next());
                while (matcher.find()) {
                    rating = Double.parseDouble(matcher.group());
                    if (rating >= 8.5 & rating <= 9.0) {
                        System.out.println(matcher.group());
                    }
                }
            }
        }*/
    }


    @AfterTest
    public void exit() {
        driver.close();
        driver.quit();
    }
}