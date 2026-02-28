package is.oops.innerClasses.annonymousInnerClass;

public interface Payment {
   void pay();
}
class PaymentDemo{
    public static void main(String[] args) {
        //BoilerPlate code
        Payment p=new Payment(){
            public void pay() {
                System.out.println("Payment done using Credit card.");
            }
        };
        p.pay();
        //SCALA-Java 8(Streams,Annotations,Lambda,Reflection)
        Payment p1=() -> System.out.println("Cash Payment");
        p1.pay();
    }
}
/*
ℹ️ℹPoints to Remember:
*One -time implementation
*No need to create separate class
*It is used in events &callback functions
 */