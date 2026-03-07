package dsa.bitManupilations;

public class MultiplyAndDivideBy2 {
    public static void main(String[] args) {
        int n=5;//0101<< 1=1010(10)
        int result=n<<1;//Multiply by 2
        System.out.println("Result:"+result);
        int x=50;
        int res=x>>1;//Divide by 2
        System.out.println("Result:"+res);
    }
}
