package is.garbageCollection;

public class GCExample {
    public static void main(String[] args) {
      String s1=new String("Java");
      String s2=new String("Python");
      //s1 becomes null
      System.gc();//not mandatory
        //Now in the string pool, Java is not available
        //That proves that garbage Collection is automatic
        System.out.println(s1);
    }
}
