package is.oops.pillars.inheritance.hybrid;
interface Sports{
    void play();
}
class Person{
    String name;
    int x;
    Person(String name){
        this.name=name;
    }
}
public class Student extends Person implements Sports {// it is grey colour not required
    Student (String name) {
        super(name);//calling parent class constructor
    }
    @Override
    public void play() {
        System.out.println(name+ " plays Throwball.");
    }
}
class Demo1{
    public static void main(String[] args){
        Student student=new Student("Surabhi");
        student.play();
    }
}
