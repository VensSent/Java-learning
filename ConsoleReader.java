/*

1. Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода

*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    ConsoleReader reader = new ConsoleReader();
        
        String a = ConsoleReader.readString();
        System.out.println(a);
        
        int b = ConsoleReader.readInt();
        System.out.println(b);
        
        double c = ConsoleReader.readDouble();
        System.out.println(c);
        
        boolean d = ConsoleReader.readBoolean();
        System.out.println(d);
	}
}

class ConsoleReader{
    
    
    public static String readString(){
        String result;
        
        Scanner input = new Scanner(System.in);
        
        result = input.nextLine();
        return result;
    }
    
    public static int readInt(){
        int result;
        
        Scanner input = new Scanner(System.in);
        
        result = input.nextInt();
        return result;
    }
    
    public static double readDouble(){
        double result;
        
        Scanner input = new Scanner(System.in);
        
        result = input.nextDouble();
        return result;
    }    
    
    public static boolean readBoolean(){
        boolean result;
        
        Scanner input = new Scanner(System.in);
        
        result = input.nextBoolean();
        return result;
    }    
}
