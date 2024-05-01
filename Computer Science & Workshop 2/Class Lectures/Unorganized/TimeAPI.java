import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeAPI{
  public static void main(String[] args) {
    LocalTime time = LocalTime.now();
    System.out.println(time);

    LocalTime parsingTime = LocalTime.parse("03:20");
    System.out.println(parsingTime);

    LocalTime ofTime = LocalTime.of(8, 15);
    System.out.println(ofTime);

    LocalTime fastForward = LocalTime.parse("03:20").plus(5, ChronoUnit.SECONDS);
    System.out.println(fastForward);

    LocalTime fastForward1 = LocalTime.parse("03:20").plus(5, ChronoUnit.MINUTES);
    System.out.println(fastForward1);

    LocalTime fastForward2 = LocalTime.parse("03:20").plus(5, ChronoUnit.MINUTES);
    System.out.println(fastForward2);

    LocalTime fastForward3 = LocalTime.now().plus(5, ChronoUnit.MINUTES);
    System.out.println(fastForward3);

    int whichHour = LocalTime.now().getHour();
    System.out.println(whichHour);

    boolean compareTime = LocalTime.now().isBefore(LocalTime.parse("05:30"));
    System.out.println(compareTime); // false if it's before

    boolean compareTime1 = LocalTime.now().isAfter(LocalTime.parse("05:30"));
    System.out.println(compareTime1); // true if it's after
    
    LocalTime maxTime = LocalTime.MAX;
    System.out.println(maxTime);

    LocalTime minTime = LocalTime.MIN;
    System.out.println(minTime);
  }
}

/*10:17:27.217439200
03:20
08:15
03:20:05
03:25
03:25
10:22:27.246863500
10
false
true
23:59:59.999999999
00:00*/