package Assignment_1;
// a program to demonstrate the difference between method overloading and
//method overriding.
class Overload {
    void show(int a) {
        System.out.println("Integer: " + a);
    }
    void show(double a) {
        System.out.println("Double: " + a);
    }
}
class Override extends Overload {

    void show(int a) {
        System.out.println("Overridden Integer: " + a);
    }

    public static void main(String[] args) {
        Override obj = new Override();

        obj.show(100);
        obj.show(108.5);
    }
}
