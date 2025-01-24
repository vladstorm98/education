package stream_api.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        // Arrays
        int[] numbers = {1, 2, 3};
        IntStream arrayStream = Arrays.stream(numbers);
        arrayStream.forEach(e -> System.out.print(e));
        System.out.println();

        // Collection
        List<Integer> list = List.of(1, 2, 3);
        Stream<Integer> collectionStream = list.stream();
        collectionStream.forEach(e -> System.out.print(e));
        System.out.println();

        // Elements
        Stream<Integer> elementStream = Stream.of(1, 2, 3);
        elementStream.forEach(e -> System.out.print(e));
        System.out.println();

        Stream.generate(() -> 1).limit(3).forEach(e -> System.out.print(e));

    }
}
