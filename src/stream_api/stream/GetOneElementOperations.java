package stream_api.stream;

import java.util.Comparator;
import java.util.List;

public class GetOneElementOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,8,3,4);
        List<String> strings = List.of("nazar", "igor");

        // Получение первого элемента
        System.out.println(integers.stream().findFirst().orElse(10));

        // Получение максимального элемента
        System.out.println(integers.stream().max(Comparator.naturalOrder()));

        // Получение максимального элемента
        System.out.println(integers.stream().min(Comparator.naturalOrder()));
        System.out.println(strings.stream().min(Comparator.naturalOrder()));

//======================================================================================================================

        List<Student> students = List.of(
                new Student(19, "Misha"),
                new Student(21, "Mike"),
                new Student(22, "Oleg")
        );

        // Get the oldest student
        System.out.println(
                students.stream()
                        .max((student1, student2) -> student1.getAge() - student2.getAge())
                        .orElseThrow());

        // Get student with shorties name
        System.out.println(
                students.stream()
                        .min(Comparator.comparingInt(student -> student.getName().length()))
                        .orElseThrow()
        );
    }

}
