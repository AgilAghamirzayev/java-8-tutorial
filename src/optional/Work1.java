package optional;

import java.util.Optional;

public class Work1 {

    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = 10;

        Optional<Integer> a = Optional.ofNullable(value1);

        Optional<Integer> b = Optional.of(value2);
        System.out.println(sum(a,b));


    }

    static Integer sum(Optional<Integer> a, Optional<Integer> b){

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        Integer value1 = a.orElse(0);
        Integer value2 = b.orElse(0);
        return value1 + value2;
    }
}
