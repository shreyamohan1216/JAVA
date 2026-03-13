package Assignment_2;

class MyThread extends Thread {

    public void run() {
        System.out.println("Running state");
    }
}

class Main8 {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        System.out.println("New state");

        t.start();

        System.out.println("Runnable state");
    }
}