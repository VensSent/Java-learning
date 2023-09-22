/*
Задача 3. Самая короткая строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
 */

package third_task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        int i,j = 0,counter = 0;
        String s = "test";


        ArrayList<String> list = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (i=0; i<5; i++){
            s = input.readLine();
            list.add(s);
        }

        int min = list.get(0).length();
        s = list.get(0);

        for (i=1; i<list.size(); i++){
            if (list.get(i).length()<min){
                min = list.get(i).length();
                j = i;
                s = list.get(i);
            }
        }

        for (i=0; i<list.size();i++){
            if (list.get(j).length()==list.get(i).length()){
                counter++;
            }
        }

        if (counter>=1){
            for (i=1; i<=counter; i++){
                System.out.println(s);
            }

        }
    }
}
