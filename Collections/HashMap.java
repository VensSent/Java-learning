/*

3. Коллекция HashMap из котов

Есть класс Cat с полем имя (name, String).
Создать коллекцию Map<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
Требования:
Программа не должна считывать значения с клавиатуры.
Метод addCatsToMap() должен возвращать коллекцию всех котов из массива String[] cats, согласно условию.
Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.

*/
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", 
        "снежок", "босс", "борис", "визя", "гарфи"};
    
        Map<String, Cat> catsInMap = addCatsToMap(cats);
        
        for (Map.Entry<String, Cat> pair : catsInMap.entrySet()){
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }

    }
    
    public static Map<String, Cat> addCatsToMap(String[] cats){
        Map<String, Cat> toMap = new HashMap<String, Cat>();
        
        for (String s: cats){
            toMap.put(s, new Cat(s));
        } 
        return toMap;
    }

    public static class Cat{
        String name;
        
        public Cat(String name){
            this.name = name;
        }
        
        @Override
        public String toString(){
            return name !=null ? name.toUpperCase() : null;
        }
    }
}
