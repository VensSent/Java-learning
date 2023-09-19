package second_task;

import java.text.Format;
import java.util.Scanner;

public class ReverseList {
    public static void reverse(){
        int i;
        String array[] = new String[10];

        Scanner input = new Scanner(System.in);

        for (i=0; i<10; i++){
            System.out.print("Enter " + i + " value of array: ");
            array[i] = input.nextLine();
        }

        for (i=9; i>=0; i--){
            System.out.println(array[i]);
        }

    }
}
