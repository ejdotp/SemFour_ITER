// Q11. Write a Java program that converts a given date and time in UTCto the
// local date and time of a specific time zone (e.g.,"America/New_York"). Parse
// a string representing a date and timeinUTC format. Convert the parsed Instant
// to a ZonedDateTime usingaspecific ZoneId

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q11 {
    public static void main(String[] args) {
        String utcDateTimeString = "2024-05-17T12:30:00Z";
        Instant utcInstant = Instant.parse(utcDateTimeString);
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime localDateTime = utcInstant.atZone(zoneId);
        String pattern = "yyyy-MM-dd HH:mm:ss z";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Local Date and Time in " + zoneId + ":" + formattedDateTime);
    }
}

// Output:
// Local Date and Time in America/New_York: 2024-05-17 08:30:00 EDT