package threads;
//proving diagram
public class ATMTransaction extends Thread{
    public void run(){
        System.out.println("Processing ATM Transaction");
    }

    public static void main(String[] args) {
        ATMTransaction t=new ATMTransaction();
        System.out.println("Thread State:"+t.getState());//NEW
        t.start();
        System.out.println("Thread state:"+t.getState());//RUNNABLE
    }
}
/*
ℹ️Code Explanation:
*Initially the thread is in the NEW state.After calling start(),it moves to RUNNABLE and Executes the
run()method.
*The exact timing of the state changes depends on the JVM scheduler
ℹ️Points to Remember:
* Thread is created once
* start()changes state
* Thread cannot be restored
* Final state is TERMINATED or DEAD
 */