package patterns.builder.Human;

public class Main {
    public static void main(String[] args) {
        Human nasty = Human.builder()
                .age(10)
                .name("Nasty")
                .weight(100)
                .build();

        nasty.getInfo();
    }
}
