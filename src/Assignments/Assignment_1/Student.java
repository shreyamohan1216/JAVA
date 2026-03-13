package Assignment_1;
/* a program that uses a default constructor and a parameterized constructor to
initialize objects of a class Student*/
class Student {
    int id;
    String name;
    Student() {
        id = 0;
        name = "shreya";
    }
    Student(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(12, "poorvika");
        Student s2 = new Student(13, "Shreya");

        s1.display();
        s2.display();
    }
}
