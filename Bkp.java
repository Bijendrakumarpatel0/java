abstract class Animal{
    abstract void Walk();{
  System.out.println("Animal eats less food ");
    }
}
class Horse extends Animal{
    public void Walk(){
        System.out.println("Horses walks on 4 legs ");

    }
}
class dog extends Animal{
 public void Walk(){
    System.out.println("Walks very fast");
 }
}
public class Bkp {
    public static void main(String [] args){
    dog d=new dog();
    d.Walk();
   // Animal an=new Animal();
    //an.Walk();
    }
}