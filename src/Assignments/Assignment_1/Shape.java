package Assignment_1;
/*polymorphism using method overriding with a base
class Shape and derived classes Circle and Rectangle.*/
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}
