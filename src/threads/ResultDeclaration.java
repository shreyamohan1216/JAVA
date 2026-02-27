package threads;

import java.io.IOException;

public class ResultDeclaration {
    synchronized void declareResult() throws Exception {
        System.out.println("Waiting for approval...");
        wait();
        System.out.println("Result Declared");
    }
    synchronized void approve(){
        notify();//when this notifies the lock is opened and Result declared is printed
    }
    public static void main(String[] args)throws Exception {
        ResultDeclaration rd = new ResultDeclaration();
        new Thread(
                () -> {
                    try {
                        rd.declareResult();
                    }catch (Exception e) {}
                }).start();
        Thread.sleep(2000);
        new Thread(()->
            rd.approve()).start();
        }
    }
/*The declareResult() method waits until another thread calls notify(),
During wait(),the  thread releases the lock,allowing other threads to enter the synchronized code.

ℹ️Points to Remember:
*sleep()-time based
*wait()-condition based
*wait()-releases lock->by checking the notify() method
*wait() is used in inter-threaded communication
*Order-Placed->Preparing->Delivery-Delivered(pattern how the synchronization follows -real time example)
 */

