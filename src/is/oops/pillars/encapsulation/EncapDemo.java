package is.oops.pillars.encapsulation;
//Details
public class EncapDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.USN//No Access
        s1.setUSN(109);
        s1.setEmail("abc@gmail.com");
        //Use of getters
        System.out.println(s1.getUSN());
        System.out.println(s1.getEmail());
    }
}

