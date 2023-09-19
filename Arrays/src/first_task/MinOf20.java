package first_task;

import java.util.Scanner;

public class MinOf20 {
    public static int[] initializeArray(int lenght){
        int[] list = new int[lenght];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter values of array with lenght " + lenght);

        for (int i=0; i<lenght; i++){
            list[i] = input.nextInt();
        }

        return list;
    }

    public static int max(int[] array){
        int max = array[0];

        for (int i=0; i<array.length; i++){

            if (array[i]>max){
                max = array[i];
            }
        }

        return max;
    }
}
