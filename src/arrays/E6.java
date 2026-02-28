package arrays;
//Varargs(Var arguments)-{It internally uses array
public class E6 {
    public static void display(int...arr) {//...--varargs
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        display(arr);
    }
}
