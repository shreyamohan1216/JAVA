package dsa.algo.searching;

public class BinarySearch {
    static int binarySearch(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] <key) {
                s = mid + 1;//go to the right side-it means the key value is towards right so we have to move it to the right
            } else {
                e = mid - 1;//go to the left side
            }
        }
        return -1;//if key was not found,return an invalid index
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 12};
        System.out.println(binarySearch(arr, 9));
        System.out.println(binarySearch(arr, 900));
        /* int[]array={2,4,6,8,9,12};
        int key=9;
        int index=binarySearch(array,key);
        if(index!=-1){
            System.out.println(key+"is present at index"+index+"in the array:"+Arrays.toString(array));
        }else{
            System.out.println(key+"is not present in the array:"+Arrays.toString(array));
        }*/
    }
}
//the commented code will give u the detailed output and prints the value also with index  to gets this recomment the above 2lines