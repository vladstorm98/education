package start.lesson6;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Yuri";
        int age = 30;
//        String phrase = "My name is " + name + ". I am " + age + ".";
        String phrase = String.format("My name is %s. I am %d.", name, age);
        System.out.println(phrase);
        System.out.printf("My name is %s. I am %d.", name, age);

    }
}
