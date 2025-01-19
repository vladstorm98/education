package practice.exception_homework_2;

public class Watch {
    private boolean isWork = true;

    public Watch(boolean isWork) {
        this.isWork = isWork;
    }

    public void tick() throws WatchIsBrokenException{
        if (!isWork) {
            throw new WatchIsBrokenException("Watch is broken");
        }
        System.out.println("Watch ticks");
    }

    public boolean isWork() {
        return isWork;
    }
}
