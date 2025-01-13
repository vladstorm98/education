package oop.record;

public class RecordExample {
    public static void main(String[] args) {
        Human human = new Human(1992, "Ivan", "Ivanovich", "Ivanov");
        System.out.println(human);
        HumanRecord humanRecord = new HumanRecord(1992, "Ivan", "Ivanovich", "Ivanov");
        System.out.println(humanRecord);
        humanRecord.getInfo();
    }
}
