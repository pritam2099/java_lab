public class MultiCatchExample {
 public static void main(String[] args) {
 try {
 int result = Integer.parseInt("notANumber") / 0;
 } catch (NumberFormatException | ArithmeticException e) {
 System.out.println("Handled either NumberFormat or Arithmetic error: " + e.getMessage());
 }
 }
}