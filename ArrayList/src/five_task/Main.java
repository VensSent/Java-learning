/*
Задача 5. Удали последнюю строку и вставь её в начало

1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
 */

package five_task;

import javax.imageio.IIOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int i;
        String s;
        ArrayList<String> list = new ArrayList<>();

        for (i=0;i<5;i++){
            s = "Some string " + (i + 1);
            list.add(s);
        }

        for (i=0;i<13;i++){
            int last = list.size() - 1;
            s = list.get(last);
            list.remove(last);
            list.add(0,s);
        }

        for (i=0; i<5;i++){
            System.out.println(list.get(i));
        }
    }
}


