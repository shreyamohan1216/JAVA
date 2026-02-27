package threads;

public class FestRegistration {
    static class FormFilling extends Thread {
        //implements Runnabale can also be used instead of extends
        public void run() {
            System.out.println("Form Filling started");
        }
    }
    static class DocumentUpload extends Thread {
        public void run() {
            System.out.println("Document Upload Started");
        }
    }
    static class EmailNotification extends Thread {
        public void run() {
            System.out.println("Conformation email");
        }
    }
    public static void main(String[] args) {
        FormFilling t1=new FormFilling();
        DocumentUpload t2=new DocumentUpload();
        EmailNotification t3=new EmailNotification();
        t1.start();//.start();is used to start the run method in threads at the backend
        t2.start();
        t3.start();// the output order is not same so threads do not follow order it depends on jvm
    }
}
/*
⭐Java program starts with one main thread
⭐Threads allow parallel execution/concurrency
⭐output order is not guaranteed
⭐Threads share the memory
⭐Improves the performances & responsiveness
When start() is called,the JVM creates a new Thread
When run()is called directly,there is no concurrency
 */
/*ℹ️Process vs Thread
⭐Process: is a running program
⭐Thread: A path  of execution inside the program
⭐A process has its own memory
⭐Threads share the same memory
⭐Creating a Thread is cheaper than creating a process
⭐Examples:Process-> Chrome Browser Thread->New Tab of Chrome
🟢Closing a tab will not close Chrome or kill Chrome
 */