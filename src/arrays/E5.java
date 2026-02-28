package arrays;

import java.util.Arrays;

public class E5 {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));//used to print the array in one line
        int[]arr2=new int[arr1.length];//assigning length of array 1
        System.out.println(Arrays.toString(arr2));//printing the values without assigning so it takes default value
        //Copy array into another array-for loop
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];//method 1 to copy an array into another array
        }
        System.out.println(Arrays.toString(arr2));
        int[]arr3=new int[arr2.length];//method 2 to copy an array into another array
        //syntax--arraycopy(src,s_pos,des,des_pos,len)
        System.arraycopy(arr2,0,arr3,0,arr1.length);
        System.out.println(Arrays.toString(arr3));
        int[]arr4=arr3.clone();//method 3 to copy an array into another array
        System.out.println(Arrays.toString(arr4));
    }
}
