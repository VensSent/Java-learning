/*

5. Удвой слова

1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c → a,a,b,b,c,c.
3. Используя цикл for, выведи результат на экран, каждое значение с новой строки.

*/
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    int i;
	 
		ArrayList<String> words = new ArrayList<>();
		words.add("a");
		words.add("b");
		words.add("c");
		
		for (i=0;i<words.size();i++){
		    words.add(i,words.get(i));
		    i++;
		}
		
		for (i=0;i<words.size();i++){
		    System.out.print(words.get(i));
		}

	}
}
