package Assignment_2;

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts");
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        b.start();
    }
}