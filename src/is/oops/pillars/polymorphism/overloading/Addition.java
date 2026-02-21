package is.oops.pillars.polymorphism.overloading;

public class Addition {
    static void add(int a,int b) {
        System.out.println(a + b);/*cannot redefine the same and does'nt allow to
             compile hence is called compile time polymorphism*/
    }
    static void add(int a,int b,int c){//to redefine it u can change the number of parameters
            System.out.println(a+ b + c);
        }
        static void add(float a,float b){//or change the datatype
            System.out.println(a + b);
            System.out.println("Float");
        }
        static void add(double a,double b){
            System.out.println(a+b);
            System.out.println("Double");
    }
    public static void main(String[] args){
        add(1,2);
        add(1,2,3);
        add(1.3,1.2);
        add(8.3f,8.0f);
    }
}
