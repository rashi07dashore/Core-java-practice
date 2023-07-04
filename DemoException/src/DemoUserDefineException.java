

public class DemoUserDefineException {

 public static int factorial(int num) throws MyException {

  if (num < 0) {
   throw new MyException(num);
  } else {
   int f = 1;
   for (int i = 1; i <= num; i++) {
    f = f * i;
   }
   return f;
  }
 }

 public static void main(String[] args) {
  try {
   int res = DemoUserDefineException.factorial(-1);
   System.out.println("Factorial is : " + res);
  } catch (MyException ex) {
   System.out.println("Exception is : " + ex.toString());
  }
 }

}
