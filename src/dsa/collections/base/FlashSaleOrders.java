package dsa.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class FlashSaleOrders {
    public static void main(String[] args) {
        Collection<Integer>orderIds=new ArrayList<>();
        /*instead of collection above we can also take child(ArrayList<>)but this shows we can write parent
        that is (collection) to access children of any type
         */
        //Integer is a wrapper class and collection will only allow wrapper classes not primitive classes
        orderIds.add(101);
        orderIds.add(102);
        orderIds.add(103);
        System.out.println("Orders recieved:"+orderIds);
        System.out.println("No of orders:"+orderIds.size());
    }
}
