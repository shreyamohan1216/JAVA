package threads;

public class BankAccount {
    int balance=1000;
    void withdraw(int amount){
        balance-=amount;
    }
    synchronized static void main(String[] args)throws InterruptedException {
        //synchronized- so it travels one after the other
     BankAccount acc=new BankAccount();
     Thread t1=new Thread(() -> acc.withdraw(500));
     Thread t2=new Thread(() -> acc.withdraw(500));
     t1.start();
     t2.start();
       t1.join();
       t2.join();
       //join() method will make sure that the main thread waits for the child threads to complete
     System.out.println("Final Balance:"+acc.balance);
    }
}
//Race Condition -when multiple threads try to use the same memory--is solved by synchronized key