package is.garbageCollection;
//we should not use this method just for interview if asked how it was used previously in java
//ans in book under destructor
public class Test {
    @Override
    @Deprecated//it is/the method is no longer used is the meaning of deprecated
    //Both are annotations
    protected void finalize() throws Throwable{
        System.out.println("Object destroyed!");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t=null;
        for(int i=0;i<100;i++)
         System.gc();
    }
}
