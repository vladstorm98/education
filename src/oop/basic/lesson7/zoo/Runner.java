package oop.basic.lesson7.zoo;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Muhtar", 30, "Ivan");
        Cat cat = new Cat("Black", 10, "Petr");
        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();
    }






//        System.out.println(cat.color);
//        cat.color = "Red";
//        System.out.println(cat.color);
//
//        cat.destroySofa("Петра");
//        String animal = cat.hunt(false);
//        String resultHunt2 = cat.hunt(false, true);
//        cat.hunt("Morning");
//        System.out.println(animal);
//        System.out.println(resultHunt2);

//        Book book = new Book("Sherlock", "Holmes", 30, true);
//        book.printCountRows();
//        book.printCountRows(38);
//        book.printInformation();

//        cat.feed("Fish", "Meat");




}
