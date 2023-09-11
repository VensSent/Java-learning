/*

Посчитать сумму чисел

1.Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу. -1 не должно учитываться в сумме.

*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = 0, result = 0;
		 
		
		while (a != -1){
		    a = input.nextInt();
		    if (a == -1){
		        break;
		    } 
		    else{
		    result = result + a;
		    }
		}
		System.out.println("Answer: " + result);
	}
}
