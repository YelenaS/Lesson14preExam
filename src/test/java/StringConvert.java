import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 11. Сконвертировать строку  25.84553 в double
 * 12. Написать метод который удаляет из строки все, кроме цифр. Пример строки гж976ти34.рв32
 */
public class StringConvert {

    public static void main(String[] args) {
        String str1 = "25.84553";
        double d = Double.parseDouble(str1);

        System.out.println(d);
    }

    @Test
    public void onlyNumbs() { //достать все числа из строки
        String str2 = "гж976ти34.рв32";
        Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        Matcher matcher = pat.matcher(str2);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}




