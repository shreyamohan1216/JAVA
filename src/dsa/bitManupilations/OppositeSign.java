package dsa.bitManupilations;

public class OppositeSign {
    public static void main(String[] args) {
        int a=10;
        int b=-5;
        if((a^b)<0)//a xor b
          System.out.println("Opposite Sign");
        else
          System.out.println("Same Sign");
    }
}
