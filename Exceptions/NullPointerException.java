public class NullPointerException {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toUpperCase();
        }
        catch (java.lang.NullPointerException e){
            System.out.println(e);
        }
    }
}
