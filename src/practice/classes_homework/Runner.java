package practice.classes_homework;

public class Runner {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse(100);
        warehouse1.removeVodka();
        System.out.println(warehouse1.getCountVodka());

        Warehouse warehouse2 = new Warehouse(100);
        warehouse2.removeVodka();
        warehouse2.removeVodka();
        System.out.println(warehouse2.getCountVodka());


        Worker worker1 = new Worker();
        worker1.takeVodka(warehouse1);
        worker1.takeVodka(warehouse1);
        worker1.takeVodka(warehouse2);
        System.out.println(worker1.getCountBrokenVodka());
        System.out.println(warehouse1.getCountVodka());
        System.out.println(warehouse2.getCountVodka());

        Worker worker2 = new Worker(5);
        worker2.takeVodka(warehouse1);
        System.out.println(worker2.getCountBrokenVodka());
        System.out.println(warehouse1.getCountVodka());
        System.out.println(warehouse2.getCountVodka());

        Worker worker3 = new Worker();
        worker3.takeVodka(warehouse2);
        System.out.println(warehouse2.getCountVodka());

        System.out.println();
    }
}
