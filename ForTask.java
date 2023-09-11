/*
1.Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
2.Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888
3.Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

Пример:
8
88
888
...
4.Рисуем линии

Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

import java.util.Scanner;
 
class Main {
    static Scanner input = new Scanner(System.in);
 
    public static void main(String[] args) {
    //1
    for (int i=0;i<100;){
        i += 2;
             
        System.out.print(i + " ");
    } 
    System.out.println();    
    //2
    int m = input.nextInt();
    int n = input.nextInt();
    
    for (int i=0; i<m;i++){
        for (int j=0; j<n;j++){
            System.out.print(8);
            }
        System.out.println();
        }
        
    System.out.println();
    
    //3
    
    }
 
}
