/*

1. HashSet из растений

Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.

*/
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args) {
	 
	    Set<String> fruits = new HashSet<>();
	    
	    fruits.add("арбуз");
	    fruits.add("банан");
	    fruits.add("вишня");
	    fruits.add("груша");
	    fruits.add("дыня");
	    fruits.add("ежевика");
	    fruits.add("жень-шень");
	    fruits.add("земляника");
	    fruits.add("ирис");
	    fruits.add("картофель");
	    
	    for(String fruit:fruits){
	        System.out.println(fruit);
	    }

	}
}