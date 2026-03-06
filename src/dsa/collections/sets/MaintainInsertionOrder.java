package dsa.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaintainInsertionOrder {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();//LinkedHashSet<>();
        //if we use LinkedHashSet instead of HashSet the output will be the order in which we give
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(3);
        set.add(12);
        set.add(31);
        set.add(21);
        set.add(32);
        System.out.println(set);
    }
}
