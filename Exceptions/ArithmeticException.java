public class ArithmeticException {
    public static void main(String[] args) {

        try {
            int a = 42/0;
            System.out.println(a);
        }
        catch (java.lang.ArithmeticException e){
            System.out.println(e);
        }
    }
}