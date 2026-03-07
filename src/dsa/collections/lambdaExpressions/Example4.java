package dsa.collections.lambdaExpressions;

import java.util.ArrayList;
//Java String API-java8
public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(1);
        list.forEach(System.out::println);//(::)-Streams,(->)- Lambda
        list.forEach(n-> System.out.println());
    }
}
