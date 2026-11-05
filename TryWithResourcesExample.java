import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResourcesExample {
 public static void main(String[] args) {
 // The BufferedReader is automatically closed after the try block finishes
 try (BufferedReader reader = new BufferedReader(new
FileReader("test.txt"))) {
 String line = reader.readLine();
 System.out.println(line);
 } catch (IOException e) {
 System.out.println("An I/O error occurred: " + e.getMessage());
 }
 }
}
