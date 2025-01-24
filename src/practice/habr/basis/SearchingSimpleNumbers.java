package practice.habr.basis;


public class SearchingSimpleNumbers {
    public static void main(String[] args) {
        //Задача 1.2:
        //
        //Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
        //Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

        for(int i = 2; i <= 100; i ++){
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }

// =====================================================================================================================
//        Или, используя циклы с метками:

        out_for:
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) continue out_for;
            }
            System.out.println(i);
        }
    }
}
