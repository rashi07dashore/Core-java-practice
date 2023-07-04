public class DemoStringIndexOutOfBoundsException
{
  public static void main(String[] args)
  {
    String str = "Hello Students.";
    System.out.println(str);
    char ch = str.charAt(15);
    System.out.println(ch);
    System.out.println("Bye....");
  }
}
