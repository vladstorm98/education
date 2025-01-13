package oop.inheritance.lesson9;

import oop.inheritance.lesson9.dogs.Poodle;
import oop.inheritance.lesson9.dogs.Shepard;
import oop.inheritance.lesson9.dogs.Terier;

public class Runner {
    public static void main(String[] args) {

        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        System.out.println(poodle.countTeeth);

        Shepard shepard = new Shepard();
        shepard.run();
        shepard.breath();
        shepard.beAngry();

        Terier terier = new Terier();
        terier.run();
    }
}
