import java.util.HashMap;
import java.util.Map;

public class MapException {
    public static void main(String[] args) {
        try{
            Map<String,String> map = new HashMap<>(null);
            map.put(null,null);
            map.remove(null);
        }
        catch (java.lang.NullPointerException e){
            System.out.println(e);
        }
    }
}
