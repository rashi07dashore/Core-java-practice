
import java.util.Scanner;

public class DemoInputMismatchException
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any Value..");
    int num = sc.nextInt();
    System.out.println(num);
    System.out.println("Bye...."); 
  }
}
