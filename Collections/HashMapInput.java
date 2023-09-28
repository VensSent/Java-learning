/*

4. Вывести на экран список ключей

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список ключей, каждый элемент с новой строки.

*/
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    int n, i;
	    String key, value;
	    
        Scanner inputNumOfIter = new Scanner(System.in);
        Map<String,String> dict = new HashMap<String,String>();
        
        n = inputNumOfIter.nextInt();

        Scanner inputKeyValue = new Scanner(System.in);
        
        for (i=1;i<=n;i++){
            System.out.println("Enter key/value number " + i);
            key = inputKeyValue.nextLine();
            value = inputKeyValue.nextLine();
            dict.put(key, value);
        }
        
        outputMap(dict);

    }
    
    public static void outputMap(Map<String,String> dict){
        for (Map.Entry<String,String> keys : dict.entrySet() ){
            System.out.println("Key: " + keys.getKey() + " " + keys.getValue());
        }
    }
    
}
