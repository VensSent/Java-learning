/******************************************************************************

Данный класс содержит функцию с возвращением минимального значения

*******************************************************************************/

public class MinNumber{
    public static void main(String[] args)
    {
        int a = 6, b = 9, minimum;

        minimum = min(a,b);
        System.out.println(minimum);

    }

    public static int min(int c, int d){
        int lower;

        if (c<d) lower = c;
        else lower = d;

        return lower;
    }
}
