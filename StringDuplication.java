import java.util.Scanner;

public class StringDuplication {
    public static void main(String[] args) {
        String s;
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string to repeat n times");
        s = input.nextLine();
        System.out.println("Enter number of times to repeat");
        n = input.nextInt();

        printNtimes(s,n);
    }

    public static void printNtimes(String strIn, int numbIn){
        for (int i = 0; i<numbIn; i++){
            System.out.println(strIn);
        }
    }
}
