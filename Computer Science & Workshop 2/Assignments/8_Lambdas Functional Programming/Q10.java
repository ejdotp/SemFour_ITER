// Q10. Write a Java program that takes a LocalDateTime object andformats it to
// a custom string format ("yyyy-MM-dd HH:mm:ss"). Definea LocalDateTime object
// representing a specific date and time. UseDateTimeFormatter to format the
// LocalDateTime object to the desiredstring format.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q10 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 5, 17, 14, 30, 0);
        String pattern = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted LocalDateTime: " + formattedDateTime);
    }
}

// Output:
// Formatted LocalDateTime: 2024-05-17 14:30:00