package start.lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
       /* int[] array = new int [2];

        array[0] = x;
        array[1] = y;*/

//        int [] array = new int[]{x, y};
        int [] array = {x, y};
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);

//        int[] array2 = array;
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//
        int[] array2 = new int[2];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[0] = 13;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }
}
