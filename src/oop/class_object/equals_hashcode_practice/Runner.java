package oop.class_object.equals_hashcode_practice;

public class Runner {
    public static void main(String[] args) {
        User user1 = new User("ablazzing", "111111");
        User user2 = new User("ablazzing", "222222");

        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }
}
