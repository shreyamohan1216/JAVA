package is.strings;

public class StringUseCase {
    public static void main(String[] args){
        String message="Order Confirmed";
        message=message+"-ID:109";
        System.out.println(message);
        //message=message+"-ID 108";
        //System.out.println(message);
    }
}
//string is immutable
//stored in SCP(string constant pool
//every modification creates a new object-heap memory
//good for read only data