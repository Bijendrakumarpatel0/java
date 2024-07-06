interface bkp{
    void add();
}
interface biju extends bkp{
    void sub();
}
class ump implements biju{
    @Override
    public void add(){
int a=9;
int b=99;
int c=a+b;
System.out.println("addition"+c);
    }
@Override
public void sub(){
    int a=8;
    int b=0;
    int c=a-b;
    System.out.println("Subtraction "+c);
}
}
class Overridea{
    public static void main(String[] args) {
        bkp r=new bkp();
        r.add();
       // r.sub();
    }
}
