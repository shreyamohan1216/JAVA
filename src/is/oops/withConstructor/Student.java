package is.oops.withConstructor;
public class Student{
        int USN;
        String name;
        int marks;
        //Static is not for objects-it directly belongs to the class
        static String college="SNPSU";//use for common parameters instead of repeating it each time
        Student(String name,int USN,int marks){//we have to create our own parameterized constructor
            this.name=name;
            this.USN=USN;
            this.marks=marks;
        }
        void evaluateMarks() {
            if (marks >= 40) {
                System.out.println(name + "PASSED");
            } else {
                System.out.println(name + "FAILED");
            }
        }
        void studentDetails(){
            System.out.println("Name:"+this.name);
            System.out.println("USN:"+this.USN);
            System.out.println("Marks:"+this.marks);
            System.out.println("College:"+college);
        }
        public static void main(String[] args){
            //Object creation=>ClassName obj=new ClassName();
            Student s1=new Student("Surabhi",109,80);//whn created a constructor we have to assign the values here
            Student s2=new Student("Siri",108,75);
            s1.evaluateMarks();
            s2.evaluateMarks();
            s1.studentDetails();
            s2.studentDetails();
        }
    }
