package oop.class_object.hashcode;

import oop.class_object.equals.Child;

public class Runner {
    public static void main(String[] args) {
        Child child1 = new Child("Sergey Kirov", 2019);
        Child child2 = new Child("Ivan Petrov", 2018);
        Child child3 = new Child("Anastasiya Mechnikova", 2019);
        Child child4 = new Child("Valentin Ivanov", 2018);

        Child[] group0 = {child2, child4};
        Child[] group1 = {child1, child3};
        Child[][] children = {group0, group1};

        Child childForFind = new Child("Sergey Kirov", 2019);
        boolean result = false;

        ChildrenGardenWithGroups childrenGardenWithGroups = new ChildrenGardenWithGroups(children);
        for (Child child : childrenGardenWithGroups.getChildren()[childForFind.hashCode()]) {
            if (child.equals(childForFind)) {
                result = true;
                break;
            }
        }
        System.out.println(result);

    }
}
