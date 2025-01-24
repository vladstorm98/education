package stream_api.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<String> stringIntegers = List.of("one", "two", "three");
        Stream<Integer> stream1 = integers.stream();
        System.out.println("Count of elements: " + stream1.count());
        
        Stream<Integer> stream2 = integers.stream();
        stream2.forEach(e -> System.out.println("Element: " + e));

        Stream<String> stream = stringIntegers.stream();

        Map<Boolean, List<String>> partitioned = stream.collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println(partitioned);

        List<String> list = Arrays.asList("apple", "banana", "cherry", "apple");

        List<String> result = list.stream()
                .filter(s -> s.startsWith("a"))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result); // [apple]


    }
}
