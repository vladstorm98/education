package oop.basic.lesson7.zoo;

import java.util.Arrays;

public class Dog {
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Andrey";

    {
        System.out.println("Собака внесена в базу!");
    }

    public Dog(String name, int weight, String owner) {
        if (weight < 1) {
            this.weight = 5;
        } else {
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public Dog() {

    }

    public void feed(String ...product) {
        System.out.printf("Собака поела %s\n", Arrays.toString(product));
    }

    public void setWeight(int newWeight) {
        if (newWeight < 1) {
            this.weight = 5;
        } else {
            this.weight = newWeight;
        }
    }

    public String getOwner() {
        return "Mr. " + this.owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
