class A extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        int p = Thread.currentThread().getPriority();
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " - Priority: " + p + " - Count: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 class priority{
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();
        
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        
        // Set different priorities
        t1.setPriority(Thread.MIN_PRIORITY); 
        t2.setPriority(Thread.NORM_PRIORITY); 
        t3.setPriority(Thread.MAX_PRIORITY); 
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getName() + " priority: " + t1.getPriority());
        System.out.println(t2.getName() + " priority: " + t2.getPriority());
        System.out.println(t3.getName() + " priority: " + t3.getPriority());
    }
}
