package oop.exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            int[] ints = new int[2];
            System.out.println(ints[3]);
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        System.out.println("works");
    }
}
