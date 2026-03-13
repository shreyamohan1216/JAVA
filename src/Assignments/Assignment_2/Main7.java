package Assignment_2;

public class Main7 {


    static void check(int num) {
        if(num < 0)
            throw new ArithmeticException("Negative number");
        else
            System.out.println("Valid number");
    }

    public static void main(String[] args) {
        check(-5);
    }
}