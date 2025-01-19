package practice.inheritance_homework;

public abstract class Electronic {
    private boolean isWork = false;

    public abstract void work();

    public void on() {
        this.isWork = true;
    }

    public void off(boolean isWork) {
        this.isWork = false;
    }
}

