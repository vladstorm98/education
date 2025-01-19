package practice.inheritance_homework;

public class Computer extends Electronic {

    @Override
    public void work() {
        System.out.println("Perform computing");
    }

    public void loadSystem() {
        System.out.println("Loading system");
    }

}
