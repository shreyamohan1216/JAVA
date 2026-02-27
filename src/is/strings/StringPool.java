package is.strings;
//{import java.lang.StringBuilder;
//import java.lang.StringBuffer; belongs to the package lang}
public class StringPool {
    public static void main(String[] args){
        String s1="Java";
        String s2="Java";
        System.out.println(s1==s2);//checks value
        String s3=new String("Java");
        System.out.println(s1==s3);//checks reference/obj
        System.out.println(s1.equals(s3));
    }
}
/*s1 & s2 share same obj in pool
new String()creates new heap onject
== compares references
.equals() compares values
 */