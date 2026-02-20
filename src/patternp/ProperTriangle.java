package patternp;

public class ProperTriangle {
    static void main(String[]args) {
        int i;
        int j;
        int k;
        int n = 7;
        for (i = 1; i <= n; i++) {
            for (k = i; k <= n; k++) {
                System.out.print("  ");
            }
            for (j = 1; j <=i; j++) {
                System.out.print(" * " + "  ");
            }
            System.out.println();
        }
    }
}
