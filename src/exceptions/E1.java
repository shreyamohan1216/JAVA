package exceptions;

public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i =10;
        j=10;
        try {
            k = i / j;//any  logical formula we write has to be in try block
            int[]arr={1,2,3,4,5};
            System.out.println(arr[9]);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");//and the exception of wt it is shld be in catch
            e.printStackTrace();//Details used in backend
        }catch(ArrayIndexOutOfBoundsException e){//checked exceptions
            System.out.println("Invalid Array Index");
            //till here it is individual exceptions
        }catch(Exception e){
            System.out.println("Something unexpected happened.");//any exception can be handled by this exception
            //this is base class exception it shld be initialized below if initialized above then no need individual exceptions
        }finally{//is used to release the resources created by the static
            System.out.println("End of Execution");
            System.out.println("Turn off Load DB");
            System.out.println("Turn off Load Files");
        }
        System.out.println("The value of k is:"+k);
    }
    static {//always executes in the beginning and can be written anywhere
        System.out.println("Start Execution");
        System.out.println("Load DB");
        System.out.println("Load Files");
    }
}
//which method or line will give u the exception-e.printStackTrace()
//can we write the base class above all-no/Compilation error