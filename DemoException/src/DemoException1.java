public class DemoException1
{
  public static void main(String[] args)
  {
     System.out.println("Hello Students..");
     try
     {
       int x = 10/0;
       System.out.println(x);
       System.out.println("Demo......");
     }
     catch(ArithmeticException ae)
     {
       System.out.println("Exception is : "+ae.toString() );
     }
     System.out.println("Bye....");
  }
}
