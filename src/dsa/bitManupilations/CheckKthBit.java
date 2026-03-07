package dsa.bitManupilations;

public class CheckKthBit {
    public static void main(String[] args) {
        int n=10;//4 not set
        int k=1;
        if((n&(1<<k))!=0){
            System.out.println("Bit is a set");
        }else{
            System.out.println("Bit is Not a set");
        }
    }
}
//refer sir's git
