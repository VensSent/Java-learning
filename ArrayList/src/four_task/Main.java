/*
Задача 4. 10 строчек в начало списка

1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
 */

package four_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        int i;
        String s;
        ArrayList<String> list = new ArrayList<>();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        for (i=0;i<4;i++){
            s = input.readLine();
            list.add(s);
        }

        System.out.println("Enter your string to add");

        for (i=0;i<10;i++){
            s = input.readLine();
            list.add(i, s);
        }

        for (i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
