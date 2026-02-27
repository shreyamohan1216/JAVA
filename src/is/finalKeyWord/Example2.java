package is.finalKeyWord;

public class Example2 {
    {
        System.out.println("IIB2");
    }
    //If we don't initialize a final variable,
    //where is it initialized?=constructor
    final int x;
    //If we don't initialize a final variable,
    //where is it initialized?=
    static final int y;

    Example2() {
        x = 200;
    }

    public static void main(String[] args) {
        new Example2();
    }

    static {
        y = 10;
        System.out.println("Start");
        System.out.println("DB-start");
        System.out.println("Load Files");
    }
    {//instance initializer block IIB
        System.out.println("IIB1");
    }
}
