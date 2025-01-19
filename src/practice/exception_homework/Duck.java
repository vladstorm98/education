package practice.exception_homework;

public class Duck implements Flyable{
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException{
        if (isInjured) {
            throw new FlyException("Duck is injured");
        }
        System.out.println("Duck flies");
    }
}
