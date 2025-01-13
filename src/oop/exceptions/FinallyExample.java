package oop.exceptions;

public class FinallyExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            throw new ArithmeticException("new error");
        } finally {
            System.out.println("works");
        }

    }
}
