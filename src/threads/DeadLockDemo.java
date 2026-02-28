package threads;

public class DeadLockDemo {
    static final Object accountA=new Object();
    static final Object accountB=new Object();
    static void main(String[] args) {
        Thread t1=new Thread(()->{
            synchronized (accountA){
                System.out.println("Thread 1 locked Account A");
                try{
                    Thread.sleep(2000);//delay by using sleep
                }catch(Exception e){}
                synchronized (accountB){
                    System.out.println("Thread 1 locked Account B");
                }
            }
        });
        Thread t2=new Thread(()->{
            synchronized (accountB){
                System.out.println("Thread 2 locked Account B");
                try{
                    Thread.sleep(2000);
                }catch(Exception e){}
                synchronized (accountA){
                    System.out.println("Thread 2 locked Account A");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
/*
Thread 1- acquires a lock on Account A and then sleeps,giving
Thread 2-acquires a lock on Account B.Now,Thread1 waits for Account A and Thread2 waits for Account B.
Since neither thread releases the lock.Both keep waiting & thus creating a DEADLOCK🔏
ℹ️DEADLOCK EXPLANATION:
Deadlock occurs when each thread is holding resource and waiting for the other to release it.
 */

/*
Thread 1 locked Account A
Thread 1 locked Account B
Thread 2 locked Account B
Thread 2 locked Account A----output
Interview Question how did u get this output
Ans-may be the jvm allowed the first thread to execute and then the second and thats how deadlock
did not happen
*if we need deadlock to happen then we use delay that is .sleep()method
 */
