package dsa.collections.queue;

import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {
        Deque<String>actions=new java.util.ArrayDeque<>();
        //it is used in undo redo problems
        actions.addLast("User Types A");//adds A
        actions.addLast("User Types B");//adds B
        actions.addLast("User Deletes B");//Deletes B
        System.out.println("Undo:"+actions.removeLast());//Undo's delete-removeLast
        System.out.println("Remaining actions:"+actions);//prints remaining element
    }
}
