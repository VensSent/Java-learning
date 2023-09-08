/******************************************************************************

Данный класс содержит функцию с возвращением минимального значения для 3-х 
переменных

*******************************************************************************/
import java.util.Scanner;

public class MinimumOf3 {
    public static void main(String[] args)
    {
        int a, b, c;
        int minimum;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        minimum = min(a,b,c);
        System.out.print(minimum);
      
    }
    
    public static int min(int d, int e, int f){
        int lowest;
        
        if (f<d && f<e) lowest = f;
        else if (e<f && e<d) lowest = e;
        else if (d<f && d<e) lowest = d;
        else lowest = 0;
        
        return lowest;
        
    }

}
