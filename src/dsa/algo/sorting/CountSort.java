package dsa.algo.sorting;

import java.util.Arrays;

public class CountSort {
    public static void countSort(int[] arr) {
        //Step1:Find the max
        int k = arr[0];
        for (int i = 1; i < arr.length; i++) {//helps in searching greater value and replacing it
            if (arr[i] > k) {
                k = arr[i];
            }
        }
        //Step 2: Create a count array[0-max]
        int[] count = new int[k + 1];
        //Step 3:Calculate freq of each element in the array
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;//if arr[i]=2 then go to that index and say ++
        }
        //Step 4:Calculate the cumulative freq
        //Skip index 0 and start with index 1 till max(k)
        for (int i = 1; i <= k; i++) {
            //cur=cur+prev
            count[i] += count[i - 1];
        }
        //Step 5:Create the output array
        int[] output = new int[arr.length];
        //Step 6:Start from the end of the array(L to R)
        for (int i = arr.length - 1; i >= 0; i--) {
            output[--count[arr[i]]] = arr[i];
            /*first create an output array[]=arr[] where the arr starts from the last element that is i
            so it becomes arr[i] meanwhile we have to access output to print so bfr that we take the value
            for arr[i] go to cumulative count see the count value so we say output[count[arr[i]]] arr[i] is
            because we take ith value from the original array and later we have decrement -1 from the count
            so we say -- bfr storing so it becomes output[--count[arr[i]]]
             */
        }
            //Copy the output back to the input
            System.arraycopy(output,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 1, 6, 4, 3};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
