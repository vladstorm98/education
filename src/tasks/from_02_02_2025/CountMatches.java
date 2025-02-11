package tasks.from_02_02_2025;

import java.util.ArrayList;

public class CountMatches {
    public static void main(String[] args) {
        // Вернуть элементы в промежутке [0; 50) в которых встречаются числа 3, 5, 6
        var numbers = new int[]{3, 5, 6};
        var result = new ArrayList<Integer>();

        for (int number : numbers) {
            for (int i = 0; i < 50; i++) {
                if (String.valueOf(i).contains(String.valueOf(number)) && !result.contains(i)) {
                    result.add(i);
                }
            }
        }

        System.out.println(result); // [3, 13, 23, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 43, 5, 15, 25, 45, 6, 16, 26, 46]
    }
}
