package start.lesson6;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "hello world!";
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        String textLower = text.toLowerCase();
        System.out.println(textLower);

        int lenght = text.length();
        System.out.println(lenght);

        boolean containsHello = text.contains("hello");
        System.out.println(containsHello);

        String replacedText = text.replace("r", "a");
        System.out.println(replacedText);

        String textRepeated = text.repeat(10);
        System.out.println(textRepeated);

        String names = "Olga,Yuri,Petr,Vasya";
        String[] namesArray = names.split(",");
        System.out.println(Arrays.toString(namesArray));

        String word1 = "hi ";
        String word2 = "man";
        String result = word1 + word2;
        System.out.println(result);

        boolean startsWithHel = text.startsWith("hel");
        System.out.println(startsWithHel);

        boolean endsWithHel = text.endsWith("orld!");
        System.out.println(endsWithHel);

        String firstFiveLetters = text.substring(0, 5);
        System.out.println(firstFiveLetters);

        String lengthText2 = "hello".replaceAll("l", "a").toUpperCase();
        System.out.println(lengthText2);
    }
}
