package codewars.java.human.readable.time;

public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    String hours = "";
    String min = "";
    if ((seconds / 3600) > 0) {
      hours = String.valueOf(seconds / 3600);
      seconds -= Integer.parseInt(hours) * 3600;
    }
    if ((seconds / 60) > 0) {
      min = String.valueOf(seconds / 60);
      seconds -= Integer.parseInt(min) * 60;
    }
    return String.format("%2s:%2s:%2s", hours, min, seconds).replace(' ', '0');
  }
}