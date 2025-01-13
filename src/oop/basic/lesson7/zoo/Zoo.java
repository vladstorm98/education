package oop.basic.lesson7.zoo;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void feed() {
        cat.feed("Yuri", "рыбу");
        dog.feed("Yuri", "мясо");

    }
}
