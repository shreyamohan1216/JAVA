package Assignment_2;

public class Main5 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }
        catch (Exception e) {
            System.out.println("General");
        }
    }
}