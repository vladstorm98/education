package practice.interfaces_homework;

public class Rose extends Plant implements Smellable {
    @Override
    public void smell() {
        Smellable.super.smell();
    }

    @Override
    public void blossom() {
        super.blossom();
    }
}
