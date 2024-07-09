
import java.util.Scanner;

public class SecondsInADay {

    private static class Constants {
        public static final int HOURS_IN_DAY = 24;
        public static final int MINUTES_IN_HOUR = 60;
        public static final int SECONDS_IN_MINUTE = 60;
    }

    public static int calculateSeconds(int days) {
        return days * Constants.HOURS_IN_DAY * Constants.MINUTES_IN_HOUR * Constants.SECONDS_IN_MINUTE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");

        int days = scanner.nextInt();

        System.out.println(calculateSeconds(days));
        
        scanner.close();

    }
}
