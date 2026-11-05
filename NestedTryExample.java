public class NestedTryExample {
 public static void main(String[] args) {
 try {
 System.out.println("Outer try block starts.");

 try {
 // Inner try block
 int result = 10 / 0;
 } catch (ArithmeticException e) {
 System.out.println("Inner catch: Handled division by zero.");
 }
 // This code continues running because the inner exception was caught
 String text = null;
 System.out.println(text.length()); // Throws NullPointerException
 } catch (NullPointerException e) {
 System.out.println("Outer catch: Handled null pointer exception.");
 }
 }
}