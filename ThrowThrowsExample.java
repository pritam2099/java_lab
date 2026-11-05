public class ThrowThrowsExample {
 // Method declares it throws a checked exception using 'throws'
 public static void validateAge(int age) throws IllegalArgumentException {
 if (age < 0) {
 // Manually trigger an exception using 'throw'
 throw new IllegalArgumentException("Age cannot be negative.");
 }
 System.out.println("Age is valid: " + age);
 }
 public static void main(String[] args) {
 try {
 validateAge(-5);
 } catch (IllegalArgumentException e) {
 System.out.println("Caught exception: " + e.getMessage());
 }
 }
}