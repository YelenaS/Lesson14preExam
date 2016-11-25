import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 Создать тестовый метод который принимает в себя параметры и передавить их из testng.xml
 */

public class XmlDemo {

    @Test
    @Parameters({"str", "str2"})
    public void parametersTest(String str, String str2) {
        System.out.println("TEST str1: " + str);
        System.out.println("TEST str2: " + str2);

    }
}