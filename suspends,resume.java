class A extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(n);
                Thread.sleep(1000);  
                Thread.yield();
            }
        } catch (InterruptedException i) {
            i.printStackTrace();
        }
    }
}

public class B {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        try {
            
            Thread.sleep(2000);
            t1.suspend();
            System.out.println("Thread 1 suspended");
            Thread.sleep(2000);
          //  t1.resume();
            System.out.println("Thread 1 resumed");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
