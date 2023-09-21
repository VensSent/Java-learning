package firts_task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        int i;
        String s;
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (i=0; i<5; i++){
            s = input.readLine();
            list.add(s);
        }

        System.out.println("Size of list EQ " + list.size());

        for (i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
