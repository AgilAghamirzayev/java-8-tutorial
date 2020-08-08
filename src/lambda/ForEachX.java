package lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachX {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // 1. Map entries
        Consumer<Map.Entry<String, Integer>> runnable = System.out::println;
        map.entrySet().forEach(runnable);

        // 2. Map keys
        Consumer<String> actionOnKeys = System.out::println;
        map.keySet().forEach(actionOnKeys);

        // 3. Map Values
        Consumer<Integer> actionOnValues = System.out::println;
        map.values().forEach(actionOnValues);
    }

    public static void main2(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        Consumer<Integer> runnable = System.out::println;

        list.stream()
                .filter(n -> n%2 == 0)
                .forEach(runnable);
    }


    public static void main1 (String[] args) {
        BiConsumer<String, Integer> action = (a, b) -> {
            System.out.printf("%s <-> %s \n", a, b);
        };

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        map.forEach(action);

    }
}
