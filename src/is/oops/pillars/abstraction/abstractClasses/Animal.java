package is.oops.pillars.abstraction.abstractClasses;

abstract class Animal {
    //different methods-1)Normal or Concrete Methods 2)Abstract Methods
    void eat(){//normal method
        System.out.println("Animal eats some food!");
    }
    //This Method cannot have a body
    //It will be implemented in the child classes
    abstract void run();//abstract method
    //if an abstract  class has only abstract methods
    //it is 100% abstraction
    //If it has even 1 normal method -it is not 100%
}
class Cat extends Animal {//if normal no need to extend since we have declared class in parent that is run we need to extend it here
    @Override
    void run() {
        System.out.println("Cat runs very fast");
    }
}
class Cheetah extends Animal {
    @Override
    void run() {
        System.out.println("Cheetah runs very fast");
    }
}
class Demo{
    public static void main(String[] args){
        Cat cat =new Cat();
        Cheetah cheetah=new Cheetah();
        cat.eat();
        cat.run();
        cheetah.eat();
        cheetah.run();
    }
}


