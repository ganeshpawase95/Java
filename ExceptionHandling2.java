import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("Demo.txt");
            //System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
