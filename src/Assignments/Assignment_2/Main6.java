package Assignment_2;
public class Main6 {
    public static void main(String[] args) {

        try {
            int x = 8/0;
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally block ");
        }
    }
}
