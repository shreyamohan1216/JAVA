package dsa.collections.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

class Student {
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class StudentSort{
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student(101,"Surabhi"));
        list.add(new Student(109,"Sudharshan"));
        list.add(new Student(100,"Siri"));
        for(Student s:list){
            System.out.println(s.id+","+s.name);
        }
        //Ascending Order based on Id
        Collections.sort(list,(s1,s2)->s1.id-s2.id);
        //(s1-s2)-ascending order,(s2-s1)-descending order we compare it with id so (s1.id-s2.id)
        for(Student s:list){
            System.out.println(s.id+","+s.name);
        }
    }
}
