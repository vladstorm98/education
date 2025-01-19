package practice.interfaces_homework;

public abstract class Tree implements Smellable {

    @Override
    public void smell() {
        Smellable.super.smell();
    }

    public void hasCones() {
        System.out.println("has cones");
    }
}
