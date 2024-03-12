//this exercise is from: https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true

public class TimeConversion {
  public static String timeConversion(String s) {
    String[] timeParts = s.split(":");
    int hour = Integer.parseInt(timeParts[0]);
    String minutes = timeParts[1];
    String seconds = timeParts[2];
    String amPm = seconds.substring(seconds.length() - 2);

    if (hour > 12) {
      return "Invalid 12-hour format";
    }

    if (amPm.equalsIgnoreCase("PM") && hour != 12) {
      hour += 12;
    } else if (amPm.equalsIgnoreCase("AM") && hour == 12) {
      hour = 0;
    }
    return String.format("%02d:%s:%s", hour, minutes, seconds.substring(0, 2));
  }

  public static void main(String args[]) {
    TimeConversion timeConversion = new TimeConversion();
    timeConversion.timeConversion("07:05:45PM");
  }
}
