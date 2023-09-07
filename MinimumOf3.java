/******************************************************************************

Данный класс содержит функцию с возвращением минимального значения для 3-х 
переменных

*******************************************************************************/

public class MinimumOf3 {
    public static void main(String[] args)
    {
        int a = 3, b = 10, c = 32;
        int minimum;
        
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
