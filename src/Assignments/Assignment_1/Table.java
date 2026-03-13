package Assignment_1;
// to print the multiplication table of a given number using a for loop.
import java.util.Scanner;

public class Table {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
            sc.close();
        }
    }

