import java.time.LocalTime;

public class Tester{
  public static void main(String[] args) {
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

/*10
false
true
23:59:59.999999999
00:00
https://chatgpt.com/share/25903b14-b13d-4c57-abbb-fbb8b960cdf5*/