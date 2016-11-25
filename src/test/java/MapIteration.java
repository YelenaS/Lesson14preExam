import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Администратор on 21.11.2016.
 */
public class MapIteration {
    public static void main(String[]args){
        Map<String, String> map = new HashMap<>();
        map.put("first","Mir");
        map.put("second","Trud");
        map.put("third","May");

       /* for (Map.Entry<String, String>pair: map.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }*/

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }


    }
}
