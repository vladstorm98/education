package start.lesson4;

public class Switch {
    public static void main(String[] args) {
        int numberDay = 9;

        switch (numberDay) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Дня не существует");
        }
    }
}
