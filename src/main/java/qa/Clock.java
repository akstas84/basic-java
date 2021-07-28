package qa;

import java.time.LocalDate;
import java.time.LocalTime;

public class Clock {

  public static void main(String[] args) {

    System.out.println("get Time: ");
    getTime();
    System.out.println("get Date: ");
    getDate();
    System.out.println("start and finish stopWatch: ");
    stopWatch(1000);

  }

  public static void getTime() {
    System.out.println(LocalTime.now());
  }

  public static void getDate() {
    System.out.println(LocalDate.now());
  }

  private static void stopWatch(long distanceLength) {
    long startStopWatch = startStopWatch();
    try {
      Thread.sleep(distanceLength);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    long finishStopWatch = finishStopWatch();
    System.out.println(finishStopWatch - startStopWatch);
  }

  public static long startStopWatch() {
    long start = System.currentTimeMillis();
    return start;
  }

  public static long finishStopWatch() {
    long finish = System.currentTimeMillis();
    return finish;
  }

}
