/*

1. Класс Dist
Реализовать статический метод double getDistance(x1, y1, x2, y2). 
Он должен вычислять расстояние между точками. Используй метод double Math.sqrt(double a), 
который вычисляет квадратный корень переданного параметра

*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        double x1, x2, y1, y2, a, dist;
        
        Scanner input = new Scanner(System.in);
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        
        Dist distance = new Dist();
        dist = distance.getDistance(x1, y1, x2, y2);
        
        System.out.println("Distance is " + dist);
        
	}
}

class Dist{
    static double x1, x2, y1, y2, a;
    
    public static double getDistance(double x1, double y1, double x2, double y2){
        double b, c, h;
        
        b = x2 - x1;
            if (b<0){
                b = b * (-1);
            } 
        b = b * b;
            
        c = y2 - y1;
        if (c<0){
            c = c * (-1);
        }
        
        c = c * c;
        h = b + c;
        
        double result = Math.sqrt(h);
        
        return result;
    }
}
