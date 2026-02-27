package is.finalKeyWord;

public final class Demo {

}
//class A extends Demo{cannot inherit final class}
class B {
    final void college(){
        System.out.println("SNPSU");
    }
}
class C extends B{
    //void college(){//cannot override final method
    final int x=200;
    //x=200; not allowed,x is constant(final)
    void show(final int x){
        // x=20;//cannot change the value of a final parameter
    }
}