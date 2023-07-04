
public class DemoException3 {

 public static void main(String[] args) {
  try {
   String str = "Hello Students.";
   System.out.println(str);
   char ch = str.charAt(15);
   System.out.println(ch);
  } catch (StringIndexOutOfBoundsException ae) {
   System.out.println("Exception is : " +ae.toString());
  }

  System.out.println("Bye....");
 }
}
