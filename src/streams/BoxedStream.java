package streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class BoxedStream {
    public static void main(String[] args) {
       collect();
    }

    public static void collect(){
        // works
        List<String> strings = Stream.of("how","to","do","in","java").collect(Collectors.toList());

        // doesn't work
        //List<Integer> integers = IntStream.of(1,2,3,4,5).collect(Collectors.toList());

        // for int
        List<Integer> integers = IntStream.of(1,2,3,4,5)
                .boxed().collect(Collectors.toList());
        System.out.println(integers);

        Optional<Integer> max = IntStream.of(1,2,3,4,5)
                .boxed().max(Integer::compareTo);
        System.out.println(max);

        //for long
        List<Long> longs = LongStream.of(1L, 2L, 3L, 4L, 5L)
                .boxed().collect(Collectors.toList());
        System.out.println(longs);

        // for double
        List<Double> doubles = DoubleStream.of(1d,2d,3d,4d,5d)
                .boxed().collect(Collectors.toList());
        System.out.println(doubles);
    }


}
