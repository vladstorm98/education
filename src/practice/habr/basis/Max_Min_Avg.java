package practice.habr.basis;

public class Max_Min_Avg {
    public static void main(String[] args) {
    // Задача 1.0:
    //
    // Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение. Для
    // генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

        int countNumbers = 100;
        double[] numbers = new double[countNumbers];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }

        double max = numbers[0];
        double min = numbers[0];
        double avg = 0;
        for (double number : numbers) {
            if (number > max)
                max = number;
            else if (number < min)
                min = number;
            avg += number / numbers.length;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
    }
}
