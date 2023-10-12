import java.util.ArrayList;

public class ListException {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(8);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
