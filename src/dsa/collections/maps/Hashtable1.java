package dsa.collections.maps;

import java.util.Hashtable;

public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Surabhi");
        ht.put(117, "Siri");
        ht.put(128, "Sushma");
        ht.put(100, "Bhumikha");
        ht.put(99, "Janavi");
        ht.put(101, "Janani");
        System.out.println(ht.getOrDefault(101, "Not Found"));
        //if value present then prints, else prints default value
        System.out.println(ht.getOrDefault(200, "Not Found"));
        ht.putIfAbsent(104,"Rama");//this will be added
        System.out.println("Updated Table:"+ht);
        ht.putIfAbsent(99,"Shiva");//this wont be added 99 is already present
        System.out.println("Updated Table:"+ht);
    }
}