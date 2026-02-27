package exceptions;

public class E2 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=10;
        try{
            k=i/j;
            int[]arr={1,2,3,4,5};
            System.out.println(arr[9]);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){//multi catch block
            //exception shld be assigned in order
            System.out.println("Cannot Divide by 0");
            System.out.println("Error!");
        }
    }
}
