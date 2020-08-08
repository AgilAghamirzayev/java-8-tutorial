package lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachM {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alex", "Brian", "Charles");
        names.forEach(System.out::println);

        Consumer<String> makeUpperCase = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };

        // Consumer<String> makeUpperCase = s -> System.out.println(s.toUpperCase());
        names.forEach(makeUpperCase);

        Map<String, String> map = new HashMap<>();

        map.put("A", "Alex");
        map.put("B", "Brian");
        map.put("C", "Charles");

        map.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));

        BiConsumer<String, Integer> action = (a, b) ->
        {
            System.out.println("Key: " + a +" Value: " + b);
        };



        // num Map
        Map<String,Integer> map1 = new HashMap<>();

        map1.put("A",1);
        map1.put("B",2);
        map1.put("C",3);

        map1.forEach(action);

        //1. Map entries
        Consumer<Map.Entry<String, Integer>> println = System.out::println;
        map1.entrySet().forEach(println);

        //2. Map keys
        Consumer<String> printlnKeys = System.out::println;
        map1.keySet().forEach(printlnKeys);

        //3. Map Values
        Consumer<Integer> printlnValues = System.out::println;
        map1.values().forEach(printlnValues);
        // number list
        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> print = System.out::print;
        numList.stream()
                .filter(n->n%2 == 0)
                .forEach(print);

    }

}
