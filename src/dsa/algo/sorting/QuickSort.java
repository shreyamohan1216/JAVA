package dsa.algo.sorting;
import java.util.Arrays;
public class QuickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partitionIndex(int[] arr, int s, int e) {
        int pivot = arr[s];
        int count = 0;//count is initially 0 checks how many 0's are there
        for (int i = s + 1; i <=e; i++) {//s+1 because we have to start from the 1st index not 0
            if (arr[i] < pivot) {
                count++;

            }
        }
        //Place the pivot at the position or index
        int pivotIndex = s + count;
        swap(arr, pivotIndex, s);
        //Let's manage the left and right side of the pivot
        int i = s;
        int j = e;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] < pivot) {//if the left  side is lesser -move to next
                i++;
            }
            while (arr[j] > pivot) {//if the right side is greater-move to next
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {//if the i is less than pi and j>pivot then i++ and j--
                swap(arr, i++, j--);
            }
        }
        return pivotIndex;//and it return int value so it is int
    }
    public static void quickSort(int[] arr, int s, int e) {
        //base class//If single element or OutOfBounds
        if (s >= e) {//means if there is only 1 element no need to find pi element
            return;
        }
        //find the pivot for the partition of the array
        int p = partitionIndex(arr, s, e);
        //now we use recursion to sort the LHS & RHS
        //Left part
        quickSort(arr, s, p - 1);
        //Right part
        quickSort(arr, p + 1, e);
    }
    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 3, 10, 2, 6};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
