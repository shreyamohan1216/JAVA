package exceptions;

public class ThrowableDemo {
    static void test()throws Throwable{
        throw new Throwable("Something went wrong!");
    }

    public static void main(String[] args) {
        try{
            test();
        }catch(Throwable t){
            //fully qualified name + message
            System.out.println("Handled:"+t);
            System.out.println("Handled:"+t.getMessage());// only message
        }
    }
}
/*throw new String("Error"); not possible❌
throw new Integer("Error");not possible❌
throw new Throwable("error");possible✅
throw new Runtime Exception("Error");possible✅
throw new IOException("error");possible✅
// anything under the throwable class(parent class) can be used/possible
 */