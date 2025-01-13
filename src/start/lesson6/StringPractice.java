package start.lesson6;

public class StringPractice {
    public static void main(String[] args) {
        String text = "my name is Giovanni Giorgio";

        String[] massive = text.substring(11).toLowerCase().split(" ");
        for (String word : massive) {
            System.out.println(word);
            System.out.println(word.length());
        }

        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000.00;
        boolean hasAutomaticTransmission = true;

        String result = """ 
            Привет, я менеджер салона %s
            У нас есть модель - %s за %f
            Есть ли у нее автоматическая коробка передач?
            %s
            """.formatted(carMark, carModel, price, hasAutomaticTransmission ? "Да" : "Нет");
        System.out.println(result);
    }
}
