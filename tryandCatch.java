/*class bkp {
    public static void main(String[] args) {
        String str = "1234";
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("String " + str + " cannot be parsed as an integer.");
        }
    }
}
//multiple try and catch 
package classes;
class Multicatch{
    public static void main(String [] args){
        try
        {
            int a=10;
            int b=5;
            int c;
            c=a/b;
            System.out.println(c);
            int arr[]={ 10,20,30};
            System.out.println(arr[0]);
            String str="bkps";
            System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Array Exception");
        }
        catch(ArithmeticException e)
        {
System.out.println("ArithmeticException");
        }
    }
}

class Handling
{
    public static void main(String [] args) {
        try
        {
          System.out.println("Learning Coding");
          int a=20,b=50,c;
          c=b/a;
          System.out.println(c);
          System.out.println("Like share");

        }
        catch(NullPointerException a)
        {
            System.out.println("can't divide by zero");

        }
        finally
        {
               System.out.println("Bkps");
        }
        System.out.println("main method ended");
    }
}
*/
*public class tryandCatch{

    // Method to divide two numbers
    static int divide(int a, int b) {
        if (b == 0) {
            // Throwing an instance of ArithmeticException
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            // Attempt to divide by zero
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching the thrown exception
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}
