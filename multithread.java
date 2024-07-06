// By extending threads 
class A extends Thread{
   // @Override
    public static void main(String[] args) {
        try
        {
        for(int i=1;i<=5;i++){
            System.out.println("Bijendra");
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException i){
       System.out.println("InterruptedException");
    }
    }
}
class multithread{
    public static void main(String[] args) throws InterruptedException  {
        A t=new A();
        t.start();
            for(int i=1;i<=5;i++){
                System.out.println("Patel");
                Thread.sleep(1000);
            }
    }
}
