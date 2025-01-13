package oop.anonymous_classes;

public class Runner {
    public static void main(String[] args) {
        Alive dog = new Alive() {
            @Override
            public void eat() {

            }

            @Override
            public void breath() {

            }
        };
        dog.breath();
        dog.eat();
    }
}