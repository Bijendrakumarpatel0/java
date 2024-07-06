class A extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " - Count: " + i);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println(n + " was interrupted.");
        }
        System.out.println(n + " has finished executing.");
    }
}

class interrupt {
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
            Thread.sleep(5000);
            t1.interrupt();
            System.out.println("Thread 1 interrupted");
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
