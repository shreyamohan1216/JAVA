package arrays;

import org.w3c.dom.ls.LSOutput;

class Student{
    String name;
    int USN;
}
class Intern{
    String name;
    int id;
    Intern(String name,int id){
        this.name=name;
        this.id=id;
    }
}
//Array of Objects{Student Objects}
public class E7 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0]=new Student();
        students[0].name="Surabhi";
        students[0].USN=109;
        System.out.println(students[0].name+ " " +students[0].USN);
        Intern[]interns=new Intern[]{
                new Intern("Surabhi",109),
                new Intern("Siri",110),
                new Intern("Bhumikha",111)
        };//another method is intern example
        //The data type is the class itself
        for(Intern i:interns){
            System.out.println(i.name+" "+i.id);
        }
    }
}
