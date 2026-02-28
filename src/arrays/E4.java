package arrays;

import java.beans.PropertyEditorSupport;

public class E4 {
    //Passing array in to methods->Array is called by reference-address is passed
    public static void printArray(int[]arr) {
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static int[] createArray(){//returns array of an integers
        return new int[]{10,20,30};//new array created & returned
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        printArray(arr);
        int[]result=createArray();
        for(int num: result){
            System.out.print(num+" ");
        }
        System.out.println();
        printArray(new int[]{100,200,300});//this is an anonymous array because we dont have a reference or obj
        //After the method call,we can never access it
    }
}
