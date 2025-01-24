package stream_api.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingTerminalOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 6, 5, 2);

        // Sum of elements
        integers.stream().reduce(Integer::sum)
                .ifPresent(System.out::println);

        // Collect all elements to list
        List<Integer> collection = integers.stream().collect(Collectors.toList());
        System.out.println(collection);

        // Collect all uniq elements to set
        Set<Integer> collectionSet = integers.stream().collect(Collectors.toSet());
        System.out.println(collectionSet);

        // Collect elements to map (element : count)
        Map<Integer, Integer> collected = integers.stream()
                .collect(Collectors
                        .toMap(element -> element, element -> 1,
                                (valuePrev, valueCurrent) -> valuePrev + valueCurrent));
                                // equals Integer::sum
        System.out.println(collected);
    }
}
