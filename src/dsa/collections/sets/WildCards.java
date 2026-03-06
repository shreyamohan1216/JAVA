package dsa.collections.sets;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void printList(List<?> list){
        for(Object o:list){
            System.out.println(o+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<String>strings=new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        printList(strings);
        List<Integer>integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        printList(integers);
    }
}
/*-When we try to implement integers as well as strings the compiler gets confused so we use '?'-wildcart to print
-This says that it will print anything but needs an class so we take the the parent class of all classes that is
Object Class.
 */
