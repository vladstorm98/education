package start.lesson5;

public class While {
    public static void main(String[] args) {
        int count = 1;
        while (count < 100) {
            System.out.println(count);
            count++;
        }
        System.out.println("Закончился");

        while (true) {
            count++;
            System.out.println(count);
            if (count == 1_000_000) {
                break;
            }
        }
    }
}
