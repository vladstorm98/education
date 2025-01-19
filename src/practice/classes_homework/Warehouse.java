package practice.classes_homework;

public class Warehouse {
    private int countVodka = 0;

    public Warehouse() {
    }

    public Warehouse(int countVodka) {
        this.countVodka = countVodka;
    }

    public int getCountVodka() {
        return this.countVodka;
    }

    public void removeVodka() {
        this.countVodka--;
    }

}
