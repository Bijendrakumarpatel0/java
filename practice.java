import java.util.Scanner; 
class practice {
    
    public static void main(String args[]){
        Scanner  Sc= new Scanner(System.in);
    
    System.out.println("Enter first number ");
    int a =Sc.nextInt();
    System.out.println("Enter Second number ");
    int b=Sc.nextInt();
    System.out.println("Enter Third number ");
    int c=Sc.nextInt();
    if(a>b && b>c){
        System.out.println("A is greateer then ");
    }
    else if(b>a && b>c){
        System.out.println("B is greater ");
    }
    else{
        System.out.println("c is greaterr");
    }
       // for(int i=0;i<=10;i++){
         //   System.out.println(i);
       //
    
    //}

    }
}