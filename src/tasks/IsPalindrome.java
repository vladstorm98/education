package tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IsPalindrome {
    public static void main(String[] args) {
        // Проверить, является ли строка палиндромом (читается одинаково слева направо и справа налево).
        String text = "maradaram";
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        List<Character> charList= new ArrayList<>();
        for (char ch : text.toCharArray()) {
            charList.add(ch);
        }

        Iterator<Character> iterator = charList.iterator();
        ListIterator<Character> listIterator = charList.listIterator(charList.size());
        while (iterator.hasNext() && listIterator.hasPrevious()) {
            if (iterator.next() != listIterator.previous()) {
                return false;
            }
        }

        return true;
    }
}
