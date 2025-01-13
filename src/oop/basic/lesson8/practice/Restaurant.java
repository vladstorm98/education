package oop.basic.lesson8.practice;

public class Restaurant {
    private static int sausageCount = 0;
    private static int breadCount = 0;

    public void cookHotDog() {
        if (sausageCount > 0 && breadCount > 1) {
            sausageCount--;
            breadCount -=2;
            System.out.println("Hot dog done");
        } else {
            System.out.println("No goods");
        }
    }

    public void addGoods() {
        sausageCount += 100;
        breadCount += 200;
        System.out.println("Goods got!");
    }
}
