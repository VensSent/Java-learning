/*

1. Три массива

1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Метод bubbleSort должен сортировать массивы в порядке возрастания
4. Используя метод printList, выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.nextInt

*/
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    int i, j, numb, checkNum;
	    boolean isDivisOn2, isOther2;
		ArrayList<Integer> allNumb = new ArrayList<>();
		ArrayList<Integer> divisible3 = new ArrayList<>();
		ArrayList<Integer> divisible2 = new ArrayList<>();
		ArrayList<Integer> others = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		for (i=0;i<10;i++){
		    numb = input.nextInt();		
		    allNumb.add(i,numb);
		}
		
		for (i=0; i<allNumb.size();i++){
		    checkNum = allNumb.get(i);
		    isDivisOn2 = false;
		    
		    if (checkNum%3 == 0 && checkNum != 0){
		        divisible3.add(checkNum);
		        if (checkNum%2 == 0 && checkNum != 0){
		            divisible2.add(checkNum);
		            isDivisOn2 = true;
		        }
		    }
		    
		    if (checkNum%2 == 0 && checkNum != 0 && isDivisOn2 == false){
		            divisible2.add(checkNum);
		        }
		        
		    if ((checkNum%3 != 0 && checkNum%2 != 0) || checkNum == 0){
		        others.add(i);
		    }
		}
		
		bubbleSort(divisible3);
		bubbleSort(divisible2);
		bubbleSort(others);
		
		printList(divisible3,divisible2,others);
		    
		
	}
	public static void printList(ArrayList<Integer> div3, ArrayList<Integer> div2, ArrayList<Integer> other){
	    int i;
	    for (i=0;i<div3.size();i++){
		        System.out.print(" " + div3.get(i) +" ");
		    }
		    
		    System.out.println();
		    
		    for (i=0;i<div2.size();i++){
		        System.out.print(" " + div2.get(i) +" ");
		    }
		    
		    System.out.println();
		    
		    for (i=0;i<other.size();i++){
		        System.out.print(" " + other.get(i) +" ");
		    }
		    
		    System.out.println();
	}
	
	public static void bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

}


