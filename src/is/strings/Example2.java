package is.strings;
//*String is immutable-we cannot change it
//*we can just create copies-original string doesn't change
//The concat ()method creates a new object-so result is ignored
public class Example2 {
    public static void main(String[] args){
        String s ="Java";//string is immutable
        s.concat("programing");
        System.out.println(s);
    }
}
