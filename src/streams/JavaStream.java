package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream {

    public static void main(String[] args) {

        Consumer<Integer> println = System.out::println;

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
        integerStream.forEach(println);

        Stream<Integer> integerStream1 = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        integerStream1.forEach(System.out::println);
//
//        Stream<Date> stream = Stream.generate(Date::new);
//        stream.forEach(System.out::println);

        IntStream chars = "a_z".chars();
        chars.forEach(System.out::println);

        Stream<String> split = Stream.of("A$B$C".split("\\$"));
        split.forEach(System.out::println);

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        // Stream.reduce()
        Optional<String> reduce = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);
        reduce.ifPresent(System.out::println);
    }
}
