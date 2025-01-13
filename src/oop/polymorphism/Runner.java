package oop.polymorphism;

public class Runner {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        cat.eat();

        Animal[] animals = new Animal[2];
        animals[0] = dog;
        animals[1] = cat;

        for (Animal animal : animals) {
            animal.eat();
        }

        feedTwoAnimals(dog, cat);

    }

    public static void feedTwoAnimals(Animal animal1, Animal animal2) {
        animal2.eat();
        animal1.eat();
    }

}
