/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/


package four_task;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        int numbers[] = new int[10];
        int i;

        Scanner input = new Scanner(System.in);

        for (i=0; i<numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        for (i = numbers.length - 1; i>=0; i--){
            System.out.println(numbers[i]);
        }
    }
}
