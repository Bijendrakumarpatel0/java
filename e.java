import java.util.*;
class Shape{
    public void area(){
        System.out.println("display area ");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class Equivalent extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
class e{
    public static void main(String [] args){
        Shape a = new circle ();
        ((circle)a).area(4);
    }
}