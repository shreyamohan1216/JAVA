package dsa.bitManupilations;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if ((n & (n - 1)) == 0) {
            System.out.println(n + "Power of 2");
        } else {
            System.out.println(n + "Not a Power of 2");
        }
    }
}
