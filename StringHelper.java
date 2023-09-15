/*

1. Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку, повторенную count раз.
String multiply(String s) – возвращает строку, повторенную 5 раз.

*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    String s; int count;
	    
	    s  = "Aboba";
	    count = 3;
	    
	    StringHelper helper = new StringHelper();
	    
	    helper.stringMultiply(s, count);
        helper.stringMultiply(s);
	}
}

class StringHelper{

    
    public static void stringMultiply(String s, int count){
        
        
        for (int i=0; i<count; i++){
            System.out.println(s);
        }
        System.out.println();
        
    }
    
    public static void stringMultiply(String s){
        int count = 5;
        
        for (int i=0; i<count; i++){
            System.out.print(s);
        }
        System.out.println();
        
    }
}
