package is.garbageCollection;

public class GCDemo {
    public static void main() {
        GCDemo obj=new GCDemo();
        obj=null;
        System.gc();/*Now-a-days the gc method is automatically invoked/called
        *after programing execution
        *by the Object class for clutter,garbage collection & removal by the jvm
        *we do not need to call it explicitly*/
        System.out.println("GC Requested!");
    }
}
