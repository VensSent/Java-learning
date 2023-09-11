/*
Ввод с клавиатуры 3 чисел для сортировки по возрастанию
*/


import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        int[] numbers = new int[] {a,b,c}; 
        
        sortAndPrint(numbers);
  
    }
    
    public static void sortAndPrint(int[] numbers){
        int i, j, buffer;
        
        for (i=0; i<numbers.length; i++ ){
            for (j=0; j<numbers.length; j++){
                if(numbers[j]>numbers[i]){
                    buffer = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = buffer;
                    
                }
            }
            
        }
        String result = "";
        for (i=0; i<numbers.length; i++){
            result += numbers[i] + " ";
        }
        System.out.println(result);
    }
    
}
