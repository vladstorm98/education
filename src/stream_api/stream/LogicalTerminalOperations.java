package stream_api.stream;

import java.util.List;

public class LogicalTerminalOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);

        boolean anyMatch = integers.stream().anyMatch(integer -> integer == 8);
        System.out.println("Has at least one element equals 8? - " + anyMatch);

        // All elements less than 10
        boolean allMatch = integers.stream().allMatch(num -> num < 10);
        System.out.println("Are all elements less than 10? - " + allMatch);

        // No one element in the list
        boolean b = integers.stream().noneMatch(e -> e.equals(4));
        System.out.println("No one element in the list equals 4? - " + b);

    }
}
