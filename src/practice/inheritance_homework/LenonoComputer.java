package practice.inheritance_homework;

public class LenonoComputer extends Computer {
    public static void main(String[] args) {
        Computer lenonoComputer = new LenonoComputer();
        lenonoComputer.loadSystem();
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void loadSystem() {
        System.out.println("Loading Lenovo");
    }
}
