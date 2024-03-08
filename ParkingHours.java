import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ParkingHours {
  public int Solution(String E, String L) {
        // Implement your solution here
        long parkingFee = 0;

        long entraceFee = 2;
        long firstHourParkingFee = 3;
        long successiveParkingFee = 4;

        LocalTime eTime = LocalTime.parse(E);
        LocalTime lTime = LocalTime.parse(L);

        long parkingMinutes = ChronoUnit.MINUTES.between(eTime, lTime);

        long parkingHours = parkingMinutes / 60 + ((parkingMinutes % 60 > 0) ? 1 : 0); // round up to the next hour

        if (parkingHours > 1) {
            parkingFee = entraceFee + firstHourParkingFee + (parkingHours - 1)*successiveParkingFee;
        } else if (parkingHours == 1) {
            parkingFee = entraceFee + firstHourParkingFee;
        }
        System.out.println(parkingFee);
        return (int) parkingFee;
    }

    public static void main(String args[]) {
      ParkingHours solution = new ParkingHours();
      solution.Solution("10:00", "13:21");
    }
}
