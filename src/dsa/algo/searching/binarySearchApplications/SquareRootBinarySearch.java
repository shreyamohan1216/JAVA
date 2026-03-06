package dsa.algo.searching.binarySearchApplications;

public class SquareRootBinarySearch {
    public static int sqrt_bs(int n){
        int s=0;
        int e=n;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int square=mid*mid;//eg:6*6=36
            if(square==n){
              return mid;
            }else if(square>n){
            e=mid-1;//Go to the left hand side
            }else{
            //store the probable ans and move to the right
            ans=mid;//The mid value is stored in the answer
            s=mid+1;//We move to the right to find accurate  ans
        }
    }
    return ans;
}
public static void main(String[] args) {
    System.out.println(sqrt_bs(36));
    System.out.println(sqrt_bs(37));
    //till 48 its 6 only becz it takes only the integral part of the number
}
}
