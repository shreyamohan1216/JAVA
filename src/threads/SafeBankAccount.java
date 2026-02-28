package threads;

public class SafeBankAccount {
    int balance=1000;
    synchronized void withdraw(int amount){
        balance-=amount;
    }
     static void main(String[] args)throws InterruptedException {
        //synchronized- so it travels one after the other
     SafeBankAccount acc=new SafeBankAccount();
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
/*
Code Explanation:
*The synchronized keyword ensures that only one thread can execute the withdraw() method operation at a time,
preventing RACE CONDITION and ensuring correct balance deduction.
ℹ️Points to Remember:
*Synchronization Avoids RACE CONDITION
*Locks Critical Section in an application
*It is slower but obviously very safe
*It is essential for shared Resources
 */