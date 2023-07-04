public class DemoException2
{
  public static void main(String[] args)
  {
    System.out.println("Hello Students..");
     try
     {
       int arr[] = new int[5];
       for(int i=0;i<=5;i++)
       {
         System.out.println(arr[i]);
       }
     }
     catch(ArrayIndexOutOfBoundsException ae)
     {
      System.out.println("Exception : "+ae.toString());
     }
    System.out.println("Bye....");
  }
}
