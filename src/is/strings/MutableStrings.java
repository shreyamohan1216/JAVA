package is.strings;

public class MutableStrings {
    public static void main(String[] args) {
         String s="SNPSU";
         s+=" ISE";
        System.out.println("String:"+s);
        StringBuffer buffer=new StringBuffer("SNPSU");//it is mutable but it is threat safe
        buffer.append(" ISE");
        System.out.println(buffer);
        StringBuilder builder=new StringBuilder("SNPSU");//it is mutable but it is threat is not safe
        builder.append(" ISE");
        System.out.println(builder);
    }
}