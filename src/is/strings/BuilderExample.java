package is.strings;

public class BuilderExample {
    public void stringInsert(){
        StringBuilder builder=new StringBuilder("JA");
        System.out.println("Old String:"+builder);
        builder.insert(1,"AV");
        System.out.println("New String:"+builder);
    }
    public void stringAppend(){
        StringBuilder builder=new StringBuilder(" SNPSU");
        System.out.println("Old String:"+builder);
        builder.append("ISE");
        System.out.println("New String:"+builder);
    }
    public void stringReverse(){
        StringBuilder builder=new StringBuilder("NOHTYP");
        System.out.println("Old String:"+builder);
        builder.reverse();
        System.out.println("New String:"+builder);
    }

    public static void main() {
        new BuilderExample().stringInsert();
        new BuilderExample().stringAppend();
        new BuilderExample().stringReverse();
    }
}
