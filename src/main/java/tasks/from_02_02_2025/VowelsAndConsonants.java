package tasks.from_02_02_2025;

import java.util.concurrent.atomic.AtomicLong;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        // Написать метод, который принимает строку и возвращает количество гласных и согласных букв.
        String text = "Petr plays Dota, and Oleg plays CS";
        System.out.println("Vowels: " + countVowelsAndConsonants(text)[0] + ", Consonants: " + countVowelsAndConsonants(text)[1]);
        System.out.println("Vowels: " + countVowelsAndConsonants2(text)[0] + ", Consonants: " + countVowelsAndConsonants2(text)[1]);
    }

    public static int[] countVowelsAndConsonants(String text) {
        String vowels = "aeyuoi";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int countVowels = 0;
        int countConsonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String ch = String.valueOf(text.charAt(i)).toLowerCase();
            if (vowels.contains(ch)) {
                ++countVowels;
            } else if (consonants.contains(ch)) {
                countConsonants++;
            }
//            vowels.contains(ch) ? countVowels++ : consonants.contains(ch) ? countConsonants++ : countConsonants;
        }

        return new int[]{countVowels, countConsonants};
    }

//======================================================================================================================
    public static AtomicLong[] countVowelsAndConsonants2 (String text) {
        String vowels = "aeyuoi";
        var consonants = "bcdfghjklmnpqrstvwxyz";
        var countVowels = new AtomicLong();
        var countConsonants = new AtomicLong();

        text.chars()
                .mapToObj(n -> Character.toString((char) n))
                .forEach(n -> {
                    if (vowels.contains(n.toLowerCase())) {
                        countVowels.incrementAndGet();
                    }
                    else if (consonants.contains(n.toLowerCase())) {
                        countConsonants.incrementAndGet();
                    }
                });

        return new AtomicLong[]{countVowels, countConsonants};
    }
}
