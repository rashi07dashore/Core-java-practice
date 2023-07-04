
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException4
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    try
    {
       System.out.println("Enter Any Value..");
       int num = sc.nextInt();
       System.out.println(num);
    }
    catch(InputMismatchException ae)
    {
       System.out.println("Exception is : "+ae.toString());
    }
       System.out.println("Bye...."); 
  }
}
