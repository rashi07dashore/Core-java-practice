import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException5
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    try
    {
       System.out.println("Enter Value of x and y..");
       int x = sc.nextInt();
       int y = sc.nextInt();
       int z = x/y;
       System.out.println(z);
    }
    catch(InputMismatchException ae)
    {
       System.out.println("Exception is : "+ae.toString());
    }
    catch(ArithmeticException ae)
    {
      System.out.println("Exception is : "+ae.toString());
    }
       System.out.println("Bye...."); 
  }
}
