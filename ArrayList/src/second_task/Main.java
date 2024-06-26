/*
Задача 2. Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
 */

package second_task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        int i;


        ArrayList<String> list = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (i=0; i<5; i++){
            String s = input.readLine();
            list.add(s);
        }

        int max = list.get(0).length();

        for (i=0; i<list.size(); i++){
            if (list.get(i).length()>max){
                max = list.get(i).length();
            }
        }
        System.out.println(max);
    }
}
