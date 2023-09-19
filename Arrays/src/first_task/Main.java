/*

1. Максимальное среди массива на 20 чисел

1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива

 */


package first_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max, lenght;
        int[] list;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter lenght of array: ");
        lenght = input.nextInt();

        list = MinOf20.initializeArray(lenght);
        max = MinOf20.max(list);

        System.out.println("Max number: " + max );
    }
}