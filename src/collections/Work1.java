package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Work1 {
    public static void main(String[] args) {

        List<String> names1 = new ArrayList<>();
        names1.add("Mahesh ");
        names1.add("Suresh ");
        names1.add("Ramesh ");
        names1.add("Naresh ");
        names1.add("Kalpesh ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Mahesh ");
        names2.add("Suresh ");
        names2.add("Ramesh ");
        names2.add("Naresh ");
        names2.add("Kalpesh ");

        sorting1(names1);
        System.out.println(names1);

        sorting2(names2);
        System.out.println(names2);
    }

    private static void sorting1(List<String> names){
        names.sort(String::compareTo);
    }

    private static void sorting2(List<String> names){
        names.sort(Comparator.naturalOrder());
    }
}
