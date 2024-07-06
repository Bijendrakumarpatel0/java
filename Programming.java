package classes;

public abstract class Programming{
    public abstract void Devloper();
    public abstract void Rank();
}
class HTML extends Programming{
    @Override
    public void Devloper(){
        System.out.println(" TIM BERners lee");

    }
    @Override
    public void Rank()
    {
        System .out .println("3rd");
    }
}
abstract class Java extends Programming{
    @Override
    public void Devloper(){
        System.out.println(" James Goslling");

    }

}
class packagess{
    public static void main(String args[]){
        HTML h=new HTML();
        h.Devloper();
        Java j=new Java();
        j.Devloper();
    }
}
    

