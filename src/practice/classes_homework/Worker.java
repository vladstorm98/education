package practice.classes_homework;

public class Worker {
    private int countBrokenVodka = 0;

    public Worker() {
    }

    public Worker(int countBrokenVodka) {
        this.countBrokenVodka = countBrokenVodka;
    }

    public void takeVodka(Warehouse warehouse) {
        System.out.println("I broke vodka!");
        countBrokenVodka++;
        warehouse.removeVodka();

    }

    public int getCountBrokenVodka() {
        return countBrokenVodka;
    }
}
