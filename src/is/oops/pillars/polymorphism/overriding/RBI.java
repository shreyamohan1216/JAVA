package is.oops.pillars.polymorphism.overriding;

public class RBI {
    double rateOfInterest(){
        return 6.5;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfInterest(){
        return 7.2;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfInterest(){
        return 7.8;
    }
}
class Demo{
    public static void main(String[] args){
        //The Reference doesn't matter ,the object type matters
        RBI  b1=new RBI();
        ICICI b2=new ICICI();//RBI can also be used as it is parent class
        HDFC b3=new HDFC();
        System.out.println("RBI roi:"+b1.rateOfInterest()+"%");
        System.out.println("ICICI roi:"+b2.rateOfInterest()+"%");
        System.out.println("HDFC roi:"+b3.rateOfInterest()+"%");
    }
}
