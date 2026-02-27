package is.oops.pillars.abstraction.interfaces;
/* a interface is an entity with completely abstract methods having empty body
that is why they exhibit 100% abstraction*/
public interface Animal {
    /*
    Interface methods are completely abstract and cannot have a body
    They are implemented in the respective child class
    Therefore,interfaces exhibit 100% abstraction
     */
    void sound();//shld be left empty
    void run();
}
class Cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Cats meow");
    }
    @Override
    public void run(){
        System.out.println("Cats run fast");
    }
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dogs bark");
    }

    @Override
    public void run() {
        System.out.println("Dogs run fast");
    }
}
class Demo{
    public static void main(String[] args){
        Cat cat=new Cat();
        Dog dog=new Dog();
        cat.run();
        cat.sound();
        dog.run();
        dog.sound();
    }
}