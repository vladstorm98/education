package start.lesson4;

public class BooleanLogic {
    public static void main(String[] args) {
        //Сынок купил хлеб
        boolean isBoughtBread = true;
        //Сынок купил молоко
        boolean isBoughtMilk = true;

        //And - логическое "и"  -  &&
        boolean isBoughtMilkAndBread = isBoughtBread && isBoughtMilk;

        if (isBoughtBread) {
            System.out.println("Молодец сынок");
        } else if (isBoughtMilk) {
            System.out.println("Молодец, хлеб и молоко взял");

        } else {
            System.out.println("Не молодец, сынок");
        }

        //Or - логическое "или"  -  ||
        //not - логическое "нет"  -  !

        boolean isBoughtCandy = true;

        if (!isBoughtCandy) {
            System.out.println("мама хвалит сына");
        }
    }

}
