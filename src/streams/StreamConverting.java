package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConverting {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream = integers.stream();

        // Convert Stream to List – Stream.collect( Collectors.toList() )
        List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbersList);

        // Convert Stream to array – Stream.toArray( EntryType[]::new )
        Integer[] evenNumberArrays = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evenNumberArrays));

    }
}
