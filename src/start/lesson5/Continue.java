package start.lesson5;

public class Continue {
    public static void main(String[] args) {
        int[] results = {3, 5, 6, 2, 1};
        for (int result : results) {
            if (result == 6) {
                continue;
            }
            System.out.println("Спортсмен отжимается");
        }
    }
}
