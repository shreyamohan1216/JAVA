package dsa.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders=new LinkedList<>();
        //For adding -add()strict[Fail],offer()not strict[Not Fail]
        orders.add("Order101");//Strict Capacity Based
        orders.offer("Order102");//offer also adds the element//Flexible
        System.out.println("Orders:"+orders);
        //For removal:remove()->Strict[Fail],poll()->Not Strict[Not Fail]
        System.out.println("Serving:"+orders.poll());//poll deletes the first element as it is FIFO
        System.out.println("Pending Order:"+orders);
        System.out.println(orders.element());//this converts the array into an element
    }
}
