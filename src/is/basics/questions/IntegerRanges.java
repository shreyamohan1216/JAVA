package is.basics.questions;

public class IntegerRanges {
    public static void main(String[] args) {
        System.out.println("Integer Max Value:"+Integer.MAX_VALUE);//2^31-1
        System.out.println("Integer Min Value:"+Integer.MIN_VALUE);//-2^31
        System.out.println("Max + 1:"+(Integer.MAX_VALUE+1));
        System.out.println("Min - 1:"+(Integer.MIN_VALUE-1));
    }
}
/*
Integer Max Value:2147483647
Integer Min Value:-2147483648
Max + 1:-2147483648--max+value/2 results in out of bound becz integer range is (-2^31 to -2^31-1)and +1 will lead to -ve number
and this is done by giving max+1
Min - 1:2147483647
 */