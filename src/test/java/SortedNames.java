import java.util.Arrays;

/**
 * Created by Администратор on 20.11.2016.
 */
public class SortedNames {
    public static void main(String[] args) throws Exception {
        String[] array = new String[]{"Masha", "Ania", "Illia", "Vasya", "Petya"};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}






