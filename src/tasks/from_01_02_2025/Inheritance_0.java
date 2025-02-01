package tasks.from_01_02_2025;

public class Inheritance_0 {
    public static void main(String[] args) {
        // Создайте класс Animal, который имеет поле name и метод makeSound(), который выводит "Animal makes a sound".
        // Затем создайте класс Dog, который наследуется от Animal и переопределяет метод makeSound() так, чтобы
        // он выводил "Dog barks".
        Dog barsik = new Dog("Barsik");
        barsik.makeSound();
    }
}

class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " barks");
    }
}