package methods;

public class IntervieOnSwapping {
    static void change (int x){
        x=100;
    }
    static void increment(int[]arr){
        arr[0]++;
    }
    public static void main(String[]args){
        int a=10;
        change(a);
        System.out.println(a);
        int[]array={5};
    }
}
