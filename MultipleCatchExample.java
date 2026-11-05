public class MultipleCatchExample {
 public static void main(String[] args) {
 String[] textArray = {"10", "abc", null};
 for (int i = 0; i <= textArray.length; i++) {
 try {
 // Potential ArithmeticException, NumberFormatException, or ArrayIndexOutOfBoundsException
 int value = Integer.parseInt(textArray[i]);
 int result = 100 / value;
 System.out.println("Result: " + result);
 } catch (NumberFormatException e) {
 System.out.println("Caught NumberFormatException: Could not parse string to int.");
 } catch (ArithmeticException e) {
 System.out.println("Caught ArithmeticException: Division by zero.");
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds.");
 } catch (Exception e) {
 // Generic catch block should always be placed at the VERY END as a safety net
 System.out.println("Caught a general exception: " +
e.getMessage());
 }
 }
 }
}
