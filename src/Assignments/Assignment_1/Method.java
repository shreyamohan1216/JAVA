package Assignment_1;
/* program to demonstrate method overloading by creating multiple methods with
the same name but different parameters.*/
class Method {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Method obj = new Method();
        System.out.println("Sum of 2 integers: " + obj.add(105, 720));
        System.out.println("Sum of 2 doubles: " + obj.add(8.5, 9.5));
        System.out.println("Sum of 3 integers: " + obj.add(1, 2, 3));
    }
}



