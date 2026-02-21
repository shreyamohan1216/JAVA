package is.oops.pillars.inheritance.single;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
}
class Student extends Person{
    int rollNo;//child class so use this()
    Student(int rollNo,String name){
        super(name);//parent class so use super
        this.rollNo=rollNo;
    }
    void display(){
        System.out.println(rollNo+" "+name);
    }
    public static void main(String[] args){
        Student s=new Student(10,"Bhumikha");
        s.display();
    }
}
/*Points to remember
*super.something->variable or method
*super()->parent class constructor
* super.->do not use for constructor
 */
