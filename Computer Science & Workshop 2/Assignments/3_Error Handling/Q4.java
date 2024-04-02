/* Implement a Java program that reads a file path from the command line argument and
attempts to read the contents of the file. If the file path is null or points to a non-existent
file, throw a custom FileNotFoundException. If the file exists but cannot be read due
to permission issues, throw a custom FileReadPermissionException. Your task is to
create these custom exception classes and handle them appropriately in your program. */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Q4 {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new CustomFileNotFoundException("File path is null");
            }
            String filePath = args[0];
            File file = new File(filePath);
            if (!file.exists()) {
                throw new CustomFileNotFoundException("File does not exist");
            }
            if (!file.canRead()) {
                throw new CustomFileReadPermissionException("File cannot be read due to permission issues");
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (CustomFileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (CustomFileReadPermissionException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
    static class CustomFileNotFoundException extends FileNotFoundException {
        public CustomFileNotFoundException(String message) {
            super(message);
        }
    }
    static class CustomFileReadPermissionException extends IOException {
        public CustomFileReadPermissionException(String message) {
            super(message);
        }
    }
}
//By :- Subhajyoti Prusty
//2241016491
//CSE-44