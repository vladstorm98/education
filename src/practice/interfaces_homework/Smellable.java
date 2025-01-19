package practice.interfaces_homework;

public interface Smellable {
    default void smell() {
        System.out.println("can smell");
    }
}
