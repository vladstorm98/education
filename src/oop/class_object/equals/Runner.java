package oop.class_object.equals;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Sergey Kirov", 2019);
        Child child2 = new Child("Ivan Petrov", 2018);
        Child child3 = new Child("Anastasiya Mechnikova", 2019);
        Child child4 = new Child("Valentin Ivanov", 2018);

        Child[] children = {child1, child2, child3, child4};
        ChildrenGarden childrenGarden = new ChildrenGarden(children);

        boolean result = false;
        Child childForFind = new Child("Sergey Kirov", 2019);

        for (Child child : childrenGarden.getChildren()) {
//            if (child.getName().equals("Sergey Kirov") && child.getYear() == 2019) {
            if (child.equals(childForFind)) {
                result = true;
                break;
            }
        }
        System.out.println(result);

    }
}
