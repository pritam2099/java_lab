public class FinallyExample {
 public static void main(String[] args) {
 try {
 System.out.println("Inside try block.");
 int x = 10 / 0; // Throws ArithmeticException
 } catch (ArithmeticException e) {
 System.out.println("Inside catch block.");
 } finally {
 System.out.println("Inside finally block - this ALWAYS runs.");
 }
 }
}