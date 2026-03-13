package Assignment_2;

// demonstrate static variables and static methods.
class Employee {
    int id;
    String name;
    static String company = "TCS";

    Employee(int i, String n) {
        id = i;
        name = n;
    }

    static void changeCompany() {
        company = "Infosys";
    }

    void display() {
        System.out.println(id + " " + name + " " + company);
    }
}
class Main3 {
    public static void main(String[] args) {

        Employee.changeCompany();

        Employee e1 = new Employee(1, "Shreya");
        Employee e2 = new Employee(2, "Poorvika");

        e1.display();
        e2.display();
    }
}