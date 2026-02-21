package is.oops.pillars.inheritance.hierarchical;

public class User {
    void role(){
        System.out.println("Generic User.!");
    }
}
class Admin extends User{
    @Override//the same role is defined in two classes means it is over riding so we use overide
    void role(){
        System.out.println("Admin User.!");
    }
}
class Guest extends User{
    @Override //keyword//Annotations in java
    void role(){
        System.out.println("Guest User.!");
    }
}
class Demo{
     public static void main(String[] args){
        User u1=new User();
        User u2=new Admin();
        User u3=new Guest();
        u1.role();
        u2.role();
        u3.role();
    }
}
