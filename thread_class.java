class MyThread1 extends Thread { // create thread class

    public void run() { // create method
        int a = 0;
        while (a < 1) {
            System.out.println("MyThread1 is running");
            a++;
        }
    }
}

class MyThread2 extends Thread {

    public void run() {
        int b = 0;
        while (b < 1) {
            System.out.println("MyThread2 is running");
            b++;
        }
    }
}

public class thread_class {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1(); // create object for thread class
        MyThread2 obj2 = new MyThread2();
        // obj1.run();
        // obj2.run();
        obj1.start(); // aise bhi likha jata h
        obj2.start();
    }
}