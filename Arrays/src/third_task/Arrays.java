package third_task;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arrays {
    public static void initArray() throws Exception{
        int i;

        String letters[] = new String[10];
        int numbers[] = new int[10];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (i=0; i< letters.length; i++){
            letters[i] = input.readLine();
        }

        for (i=0; i< numbers.length;i++){
            numbers[i] = letters[i].length();
        }

        for (i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
