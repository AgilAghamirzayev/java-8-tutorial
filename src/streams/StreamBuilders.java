package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilders {
    public static void main(String[] args) {

//        print();
//        generate();
//        charsVsTokens();
//        streamToList();
//        streamToArray();

        filter();
        map();
        sorted();
        match();
        reduce();
        parallel();
    }

    static void print(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println);
    }

    static void generate(){
        Stream<Date> stream = Stream.generate(Date::new).limit(10);
        stream.forEach(System.out::println);
    }

    static void charsVsTokens(){
        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(System.out::println);

        Stream<String> stream1 = Stream.of("A$B$C".split("\\$"));
        stream1.forEach(System.out::println);
    }

    static void streamToList(){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        List<Integer> evenNumsList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumsList);
    }

    static void streamToArray(){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        Integer[] evenNumList = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evenNumList));
    }

    static void filter(){
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().filter(s->s.startsWith("A"))
                .forEach(System.out::println);

    }

    static void map(){
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().filter(s->s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    static void sorted(){
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    static void match(){
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        boolean matchedResult = memberNames.stream()
                .anyMatch(s->s.startsWith("A"));
        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .allMatch(s->s.startsWith("A"));
        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .noneMatch(s->s.startsWith("A"));
        System.out.println(matchedResult);

    }

    static void count(){
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        long totalMatched = memberNames.stream()
                .filter(s->s.startsWith("A"))
                .count();
        System.out.println(totalMatched);;
    }

    static void reduce(){
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        Optional<String>  reduced = memberNames.stream()
                .reduce((s1,s2)-> s1 + "-" + s2);
        reduced.ifPresent(System.out::println);
    }


    static void parallel(){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        Integer[] evenNumArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evenNumArr));
    }


}
