package tasks.from_02_02_2025;

import java.util.*;

public class StringViceVersa {
    public static void main(String[] args) {
        // Написать строку наоборот
        String text = "My little brother does his homework";

//======================================================================================================================
        // First attempt with Array
        char[] chars1 = new char[text.length()];
        text.getChars(0, text.length(), chars1, 0);

        char[] result = new char[text.length()];
        for (int i = 0; i < chars1.length; i++) {
            result[i] = chars1[chars1.length - 1 - i];
        }

        System.out.println(String.valueOf(result));

//======================================================================================================================
        // Second attempt with listIterator
        List<Character> list = text.chars()
                .mapToObj(c -> (char) c)
                .toList();

        ListIterator<Character> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous());
        }
        System.out.println();

//======================================================================================================================
        // Third attempt with Stream
        text.chars()
                .mapToObj(c -> (char) c)
                .toList()
                .reversed()
                .forEach(System.out::print);
        System.out.println();

//======================================================================================================================
        // Fourth attempt
        Integer i = Integer.valueOf(9);
        doSomething(i, i);
        doSomething1(2, 1L);

    }

    public static void doSomething(int num, long num2) {

    }

    public static void doSomething1(Integer num, Long num2) {

    }
}
