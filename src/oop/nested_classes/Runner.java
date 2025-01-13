package oop.nested_classes;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human("23AA", "333223B", PassportType.FOREIGN);
//        Human.Passport passport = new Human.Passport("23AA", "333223B", PassportType.FOREIGN);
//        human.setPassport(passport);
        System.out.println(human);

    }
}
