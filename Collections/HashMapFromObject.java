import java.util.HashMap;
import java.util.Map;

public class HashMapFromObject {
    public static void main(String[] args) {
        Map<String,Object> obj = new HashMap<>();

        obj.put("first", 1);
        obj.put("Second", (int) 2);
        obj.put("Another", null);
        obj.put("Something", new long[56]);
        obj.put("Cat", new String("Boris"));
        obj.put("Boolean", false);
        obj.put("integer", (int) 4);
        obj.put("hey)", 7);
        obj.put("hello", new String("World"));
        obj.put("Main", 3);

        for (Map.Entry<String, Object> pair : obj.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
