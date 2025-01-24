package practice.habr.basis;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Задача 1.1:
        //
        // Реализуйте алгоритм сортировки "пузырьком" для сортировки массива.

        int[] numbers = {5,4,6,2,7,1,8,3};

        int countNumbers = numbers.length;
        while (countNumbers != 0){
            for (int i = 0; i < countNumbers - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
            countNumbers--;
        }
        System.out.println(Arrays.toString(numbers));

// =====================================================================================================================

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
