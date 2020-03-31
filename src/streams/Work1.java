package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Work1 {
    public static void main(String[] args) {
        // string
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println(strings);

        List<String> filtered = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        String mergedString = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(", "));
        System.out.println(mergedString);

        long count = strings.stream().filter(String::isEmpty).count();
        System.out.println(count);

        //integers
        List<Integer> numbers = Arrays.asList(3,2,2,3,7,2,5);

        List<Integer> uniqueSquaresList = numbers.stream()
                .map(i -> i*i)
                .distinct() // select uniques
                .collect(Collectors.toList());

        System.out.println(uniqueSquaresList);

        IntSummaryStatistics statistics = numbers.stream().mapToInt(x->x).summaryStatistics();
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getAverage());

        //randoms
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        random.ints().limit(10).sorted().forEach(System.out::println);






    }
}
