package dsa.collections.sets;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer>scores =new TreeSet<>();//Ascending Order
        //()-is a constructor inside it if we write Collections.reverseOrder() then this will represent the output in descending
        scores.add(450);
        scores.add(200);
        scores.add(125);
        scores.add(197);
        scores.add(550);
        System.out.println("LeaderBoard Stats:"+scores);
    }
}
