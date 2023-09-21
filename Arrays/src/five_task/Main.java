package five_task;




import java.util.Scanner;
import  java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] big = new int[20];
        int smal1[] = new int[10];
        int smal2[] = new int[10];
        int smal22[] = new int[10];
        int i;

        Scanner input = new Scanner(System.in);

        for (i=0; i<big.length;i++){
            big[i] = input.nextInt();
        }

        for (i=0; i<big.length; i++){
            if(i<=9){
                smal1[i] = big[i];
            }
            else {
                smal2[i-10] = big[i];
            }
        }
        //альтернативный вариант копирования массива
        smal22 = Arrays.copyOfRange(big, 10, 19);
        System.out.println();
        for (i=0; i< smal22.length; i++){
            System.out.println(smal22[i]);
        }

        System.out.println();

        for (i=0; i< smal2.length; i++){
            System.out.println(smal2[i]);
        }
    }
}
