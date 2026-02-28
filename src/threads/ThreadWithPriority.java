package threads;

public class ThreadWithPriority extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+"|Priority:"+Thread.currentThread().getPriority());
        }
    }

    static void main(String[] args) {
        ThreadWithPriority t1=new ThreadWithPriority();
        ThreadWithPriority t2=new ThreadWithPriority();
        ThreadWithPriority t3=new ThreadWithPriority();
        t1.setName("Low Priority Thread");
        t2.setName("Medium Priority Thread");
        t3.setName("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        //t3.setPriority(11);--will provide an IllegalArgumentException--Interview Question What will provide anIllegalArgumentException
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
ℹ️Points to Remember:
*Thread Priority is only a suggestion to the JVM or scheduler.
*High Priority doesn't gurantee execution order.
*Higher priority threads may get more CPU Scheduler time.
*The actual behaviour depends on the JVM and OS
 */

/*
*get name-will get the name of the thread
*set name()-will set the name of the thread
* set priority()-requesting CPU to give more CPU time
Lowest priority - 1
Highest priority-10
Default priority-5

 */