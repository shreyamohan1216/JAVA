package dsa.algo.special;

public class KadaneAlgo {
    static int kadaneAlgo(int[]arr){
        int cMax=arr[0];
        int gMax=arr[0];
        for(int i=1;i<arr.length;i++){
            cMax=Math.max(arr[i],cMax+arr[i]);
            gMax=Math.max(cMax,gMax);//to get the min value just change max to min
        }
        return gMax;
    }
    public static void main(String[] args) {
        int[]arr={5,-8,1,2,-1,4};//sum of the max subarray is 6
        System.out.println(kadaneAlgo(arr));
        int[]array={-1,-2,-3,-4,-5,-6,0};//sum of max subarray is less than 0 so the max value is 0
        System.out.println(kadaneAlgo(array));
    }
}
//see notes for reference
//Time complexity is O(n)-because used only 1 for loop