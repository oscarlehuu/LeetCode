//this exercise is from Hackerrank: https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {
  public static int birthdayCakeCandles(List<Integer> candles) {
    Map<Integer, Integer> candleCounts = new HashMap<>();

    for (int candle: candles) {
      candleCounts.put(candle, candleCounts.getOrDefault(candle, 0) + 1);
    }

    int tallestCandle = 0;
    for (int height: candleCounts.keySet()) {
      tallestCandle = Math.max(tallestCandle, height);
    }

    return candleCounts.get(tallestCandle);
  }

  public static void main(String args[]) {
    List<Integer> candles = Arrays.asList(3, 2, 1, 3);
    BirthdayCakeCandles birthdayCakeCandles = new BirthdayCakeCandles();
    birthdayCakeCandles.birthdayCakeCandles(candles);
  }
}
