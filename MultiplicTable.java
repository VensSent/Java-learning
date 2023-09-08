/**
 * Таблица умножения
 * Выведи на экран надпись: таблицу умножения 10 на 10:
 * 1 2 3 …
 * 2 4 6 …
 * 3 6 9 …
 * …
 */

public class MultiplicTable {
    public static void main(String[] args) {
        int row, column, result;

        for (row = 1; row <= 10; row++){
            for (column = 1; column <= 10; column++){
                result = row * column;
                System.out.print(result);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
