package dsa.bitManupilations;

public class FindTheValueOfRSB {
    public static void main(String[] args) {
        int n=12;//1100=2(2^3,2^2,2^2,2^1)
        int result=n&n-n;
        System.out.println("Rightmost Set Bit Value:"+result);
    }
}
