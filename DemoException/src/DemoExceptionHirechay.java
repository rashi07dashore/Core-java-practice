import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoExceptionHirechay
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
    catch(Exception ex)
    {
       System.out.println("Exception is : "+ex.toString());
    }
    System.out.println("Bye...."); 
  }
}