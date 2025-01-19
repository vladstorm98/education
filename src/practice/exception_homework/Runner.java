package practice.exception_homework;

public class Runner {
    public static void main(String[] args) {
        Duck duck1 = new Duck(true);
//        duck1.fly();

        Duck duck2 = new Duck(false);
//        duck2.fly();

        Plane plane1 = new Plane(10);
//        plane1.fly();

        Plane plane2 = new Plane(-1);
//        plane2.fly();

        Flyable[] flyables = {duck1, duck2, plane1, plane2};
        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println("Error : " + e.getMessage());
            }
        }

    }
}
