package stream_api.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Example {
    public static void main(String[] args) {
        Student ivan = new Student(170);
        Student petr = new Student(180);

        Student[] students = new Student[]{ivan, petr};
        System.out.println(Arrays.toString(students));

        System.out.println(ivan.getHeight() - petr.getHeight());
        System.out.println(compare(ivan, petr));
        Comparator<Student> studentComparator = (st1, st2) -> st1.getHeight() - st2.getHeight();
        System.out.println(studentComparator.compare(ivan, petr));
        sortStudents(students, studentComparator);
        System.out.println(Arrays.toString(students));
    }

    public static int compare(Student st1, Student st2) {
        return st1.getHeight() - st2.getHeight();
    }

    public static void sortStudents(Student[] students, Comparator<Student> comparator) {
        int result = comparator.compare(students[0], students[1]);
        if (result > 0) {
            Student temp = students[0];
            students[0] = students [1];
            students[1] = temp;
        }
    }
}
