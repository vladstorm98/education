package oop.basic.lesson7.zoo;

import java.util.Arrays;

public class Cat {
    public String color;
    private double weight;
    public String owner;

    public Cat(String colorName, double weightCat, String owner) {
        this.color = colorName;
        this.weight = weightCat;
        this.owner = owner;
    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерет диван %s\n", sofaOwner);
    }

    public String hunt(boolean isDay) {
        if (isDay) {
            return "Мышь";
        }
        return "Сова";
    }

    public void feed(String ...product) {
        System.out.printf("Кот поел %s\n", Arrays.toString(product));
    }


    public String hunt(boolean isDay, boolean success) {
        if (success) {
            if (isDay) {
                return "Mouse";
            }
            return "Homelander";
        }
        return "Nothing";
    }

    public void hunt(String timeOfDay) {
        if (timeOfDay.equals("Morning")) {
            System.out.println("Mouse");
        } else {
            System.out.println("Nothing");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + owner + '\'' +
                '}';
    }
}
