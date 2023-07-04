public class MyException extends Exception
{
  int num;

 public MyException(int num) {
  this.num = num;
 }

 @Override
 public String toString() {
  return "Given Number is negative."+num;
 }
  
}
