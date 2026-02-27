package exceptions;

public class E3 {
    static void checkAge(int age){
        if(age>=18){
            System.out.println("Eligible-Access Granted");
        }else{
            throw new RuntimeException("Not Eligible-Access Denied");
        }//throw-used to create custom exceptions
    }
    public static void main(String[] args) {
        checkAge(19);
    }
}
