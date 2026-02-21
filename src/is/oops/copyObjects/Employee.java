package is.oops.copyObjects;
public class Employee {
    int id;
    String name;
    public Employee(int id,String name) {
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    //static copy method
    static Employee copy(Employee e){
        return new Employee(e.id, e.name);//here employee is also a datatype because we are creatingvour own static method
    }
    public static void main(String[] args){
        Employee e1=new Employee(109,"Surabhi");
        Employee e2=Employee.copy(e1);//correct use
        //Employee e3=e2; not recommended can lead to errors!
        e2.display();
    }
    static{//it is used to start the interpretation//can be written anywhere
        System.out.println("Start of Execution");//it will always exectute it in the beginning even whn written at last
        System.out.println("Internet protocol");
        System.out.println("Db-Loading");
        System.out.println("System Files loading");
    }
}
