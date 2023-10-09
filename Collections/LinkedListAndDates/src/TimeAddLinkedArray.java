/*
Измерить сколько времени занимает вставка 10000 строк для Array и LinkedList
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Date;

public class TimeAddLinkedArray {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> linked = new LinkedList<>();

        long startTime, endTime, resultTime;


        startTime = getTime();

        for (int i = 0; i<1000000;i++){
            array.add(i, i);
        }

        endTime = getTime();
        System.out.println("ArrayList add:" );
        getResult(startTime, endTime);

        startTime = getTime();

        for (int i = 0; i<1000000;i++){
            linked.add(i, i);
        }

        endTime = getTime();
        System.out.println("LinkedList add:" );
        getResult(startTime, endTime);


    }

    public static long getTime(){
        Date date = new Date();
        long time = date.getTime();

        return time;
    }

    public static void getResult(long startTime, long endTime){
        long resultTime;
        resultTime = endTime - startTime;
        System.out.println("Time from start to end is " + resultTime + " ms");

    }
}