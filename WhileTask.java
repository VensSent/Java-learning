/*
1.Вывести на экран числа от 1 до 10, используя цикл while.
2.Вывести на экран числа от 10 до 1, используя цикл while.
3.Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз, используя цикл while.
4.Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

import java.util.Scanner;
 
class Main {
    static Scanner input = new Scanner(System.in);
 
    public static void main(String[] args) {
        int i = 0, j = 11;
        
        //1
        while (i<10){
            i += 1;
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        //2
        while (j>1){
            j -= 1;
            System.out.print(j + " ");
        }
        
        System.out.println();
        
        //3
        String s;
        int n;
        
        s = input.nextLine();
        n = input.nextInt();
        
        i = 0;
        while (i<n){
            i += 1;
            System.out.println(s);
        }
        
        System.out.println();
        
        //4
        i = 0;
        while (i<10){
            i += 1;
            System.out.println("SSSSSSSSSS");
        }
       
    }
 
}
