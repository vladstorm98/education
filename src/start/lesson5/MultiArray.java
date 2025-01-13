package start.lesson5;

public class MultiArray {
    public static void main(String[] args) {
        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 195, 193};
        int[][] multiArray = {group1, group2};

        upperFor:
        for (int[] array : multiArray) {
//            System.out.println(Arrays.toString(array));
            for (int number : array) {
                if (number == 178) {
                    System.out.println("Нашли вора!");
                    break upperFor;
                } else {
                    System.out.println("Человек не подошел");
                }
            }
        }
    }
}
