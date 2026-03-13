package Assignment_1;
/* a program to demonstrate single inheritance with a base class Animal and
derived class Dog*/
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}