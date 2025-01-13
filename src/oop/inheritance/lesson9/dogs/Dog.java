package oop.inheritance.lesson9.dogs;

import oop.inheritance.lesson9.Alive;

public abstract class Dog extends Alive {
    int countLegs = 4;
    public int countTeeth;

    public static final String LATIN_NAME = "varis huyaris";

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void beAngry() {
        System.out.println("dog richit");
    }

    public final void eat() {
        System.out.println("dog eat");
    }

    public void bark() {
        System.out.println("Dog barks");
    }

    public abstract void run();

}
