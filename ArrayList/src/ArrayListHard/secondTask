/*

2. Слова в обратном порядке

Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.

*/
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    int i;
		ArrayList<String> words = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		for (i=0;i<5;i++){
		    String s = input.nextLine();
		    words.add(s);
		} 
		
		words.remove(3);
        
        
        for(i=words.size()-1; i>-1;i--){
            System.out.print(" "+words.get(i)+" ");
        }
        System.out.println();
		
	}
	

}
