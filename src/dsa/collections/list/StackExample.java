package dsa.collections.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);//pushes the element into the stack
        System.out.println(stack.peek());//Display top element
        System.out.println("Size:"+stack.size());
        stack.pop();//Removes top element
        System.out.println("Size:"+stack.size());
        System.out.println(stack);
        System.out.println(stack.empty());//returns true or false
    }
}
