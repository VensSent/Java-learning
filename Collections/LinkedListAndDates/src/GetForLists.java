import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class GetForLists {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> linked = new LinkedList<>();

        long startTime, endTime;



        for (int i = 0; i<10000; i++){
            array.add(i,i);
            linked.add(i,i);
        }

        System.out.println("Get of Array:");
        startTime = getTime();

        for (int i : array){
            array.get(i);
        }

        endTime = getTime();
        getResult(startTime,endTime);

        System.out.println("Get of Linked:");
        startTime = getTime();

        for (int i : array){
            linked.get(i);
        }

        endTime = getTime();
        getResult(startTime,endTime);
    }
    public static long getTime(){
        long time;
        Date date = new Date();
        time = date.getTime();

        return time;
    }

    public static void getResult(long start, long end){
        long result;
        result = end - start;

        System.out.println("Time from start to end is " + result + " ms");
    }
}
