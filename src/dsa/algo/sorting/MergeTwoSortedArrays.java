package dsa.algo.sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[]array1={1,3,5,7,9};
        int[]array2={2,4,6};
        int[]merged=mergedTwoSortedArrays(array1,array2);
        System.out.println("Merged Arrays:"+ Arrays.toString(merged));
    }
    public static int[]mergedTwoSortedArrays(int[]arr1,int[]arr2){
        //write ur code here-like this it will be asked like this
        int n1=arr1.length;
        int n2=arr2.length;
        int[]merged=new int[n1+n2];
        int i=0,j=0,k=0;//i,j,k are the pointers
        //Edge case
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                merged[k++]=arr1[i++];//to store values from the arr1 to res
            }else{
                merged[k++]=arr2[j++];//to store values from arr2 to res
            }
        }
        //Check if there are any remaining elements in the two arrays and copy paste them
        while(i<n1){
            merged[k++]=arr1[i++];
        }
        while(j<n2){
            merged[k++]=arr2[j++];
        }
        return merged;
    }
}
