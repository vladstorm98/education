package tasks.from_02_02_2025;

public class FibonacciCounter {
    public static void main(String[] args) {
        // Нахождение числа Фибоначчи
        int first = 0;
        int second = 1;
        int numberFibonacci = 10;

        for (int i = 0; i < numberFibonacci - 1; i++) {
            second = first + second;
            first = second - first;
        }
       

        System.out.println(second); // 55
    }
}
