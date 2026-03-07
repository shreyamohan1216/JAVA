package dsa.collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //The values can be duplicate ,but keys have to be unique
        Map<String,String>hashmap=new HashMap<>();
        hashmap.put("01","aaaa");
        hashmap.put("03","bbbb");
        hashmap.put("04","zzzz");
        hashmap.put("02","xxxx");//all together are called entry set
        //here we get the same output as input because it maintains the base value as 0 and then checks for the next and compares it
        for(Map.Entry<String,String>entry:hashmap.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        Map<String,String>hashmap1=new LinkedHashMap<>();
        hashmap1.put("01","aaaa");
        hashmap1.put("03","bbbb");
        hashmap1.put("04","zzzz");
        hashmap1.put("02","xxxx");
        for(Map.Entry<String,String>entry:hashmap1.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
