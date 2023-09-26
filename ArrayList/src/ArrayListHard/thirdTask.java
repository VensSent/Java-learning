/*

4. Буква «р» и буква «л»

1. Создай список слов, заполни его самостоятельно.
2. Метод fix() должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза

*/
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	 
		ArrayList<String> words = new ArrayList<>();
		
		words.add("орза");
		words.add("лира");
		words.add("лоза");
		words.add("раму");
		words.add("лама");
		words.add("раму");
		
		fix(words);
		
	}
	
    public static void fix(ArrayList<String> words){
        int i;
        for (i=0;i<words.size();i++){
            if(words.get(i).contains("р") && words.get(i).contains("л")) {
                continue;
            }
            if(words.get(i).contains("р")) {
                words.remove(i);
            }
            if(words.get(i).contains("л")) {
                words.add(words.get(i));
                i++;
            }
            
        }
        
        for(i=0;i<words.size();i++){
            System.out.print(words.get(i)+" ");
        }
    }
}
