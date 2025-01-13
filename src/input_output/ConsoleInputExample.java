package input_output;

import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        long num1 = scanner.nextLong();

        System.out.println("Enter operation:");
        String operation = scanner.next();

        System.out.println("Enter second number:");
        long num2 = scanner.nextLong();

        System.out.println(calc.makeOperation(num1, num2, operation));
    }
}
