package dsa.collections.maps;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreemapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String >map=new TreeMap<>();
        map.put(3,"C");
        map.put(1,"A");
        map.put(2,"B");
        map.put(4,"D");
        System.out.println(map);
    }
}
