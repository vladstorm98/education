package start.lesson1;

public class Primitives {
    public static void main(String[] args) {
        //Логические значения (булевы значения)
        boolean answerYuri = true;
        boolean answerPeter = false;

        //Целые числа
        //Byte - весит 1б
        byte maxByte = 127;
        byte minByte = -128;

        //Short - весит 2б
        short maxShort = 32_767;
        short minShort = -32_768;

        //Short - весит 4б
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;

        //Long - весит 8б
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        //Double - число с плавающей точкой, 64 bit, 16 после точки
        double myDouble = 1.5;
        //Float - число с плавающей точкой, 32 bit, 8 после точки
        float myFloat = 0.33F;

        //Char - character (символ)
        char letter = 'Я' + 2;
        System.out.println(letter);

        char newLine = '\n';
        System.out.print('a');
        System.out.print(newLine);
        System.out.print('b');

        char tab = '\t';
        char escape = '\\';
        System.out.println(escape);

        var countPeople = 15;
        var letter_2 = 'Б';
        System.out.println(letter_2);

    }
}
