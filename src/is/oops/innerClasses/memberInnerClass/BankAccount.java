package is.oops.innerClasses.memberInnerClass;

public class BankAccount {
    private double balance=10000;
    //Member Inner Class-class inside the class
    class Transaction{//inner class
        void withdraw(double amount){
            if(amount<=balance){
                balance-=amount;
                System.out.println("Withdrawn:"+amount);
            }else{
                System.out.println("Insufficient Funds.");
            }
        }
    }//till here class inside class becz we need not know hw the transaction happens

    public static void main(String[] args){
        BankAccount account=new BankAccount();
        //Outer.Inner in_object=out_object.new Inner();--syntax
        BankAccount.Transaction tx=account.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(2000);
        System.out.println(account.balance);
    }
}
/*
ℹ️Points To Remember:
*Transaction belongs to specific account
*Direct Access to private variable balance
*Clean Encapsulation
 */