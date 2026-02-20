package is.basics.wrapperclass;
public class E1 {
    public static void main(String[]args){
        int x=10;
        Integer obj1=Integer.valueOf(x);//boxing
        int y=10;
        Integer obj2=y;//auto boxing
        System.out.println(obj1);
        System.out.println(obj2);
        Integer obj3=Integer.valueOf(50);
        int z=obj3.intValue();
        Integer obj4=Integer.valueOf(100);
        int a=obj4;
        System.out.println(z);
        System.out.println(a);
        char[] letters={'s','i','r','i'};
        String name=new String(letters);
        System.out.println(name);
    }
}
