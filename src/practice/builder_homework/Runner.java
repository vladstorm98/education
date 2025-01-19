package practice.builder_homework;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);

//        Human.HumanBuilder humanBuilder = new Human.HumanBuilder();
//        Human nasty = humanBuilder.age(10).name("Nasty").weight(100).build();

        Human nasty = Human.builder().age(10).name("Nasty").weight(100).build();
        System.out.println(nasty);
        nasty.getInfo();
    }
}
