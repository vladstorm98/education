package start.lesson1;

public class MathOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int sum = x + y;
        System.out.println(sum);

        int diff = sum - x;
        System.out.println(diff);

        int divide = x / y;
        y = 3;
        double divide_2 = (double) x / y;
        System.out.println(divide_2);

        int ext = x * x;
        System.out.println(ext);

        //Инкремент.Декремент Добавить единицу +1
        x++;
        x--;
        System.out.println(x);

        //Добавить +11
        x += 11;
        x *= 11;
        x /= 11;
        System.out.println(x);

        int number = 4;

        double height = 1.95;
        int weight = 92;
        double index = weight / (height * height);
        System.out.println(index);
    }
}
