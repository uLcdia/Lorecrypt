
import java.util.Scanner;

public class GiftTax {
    
    private static class Constants {
        public static final int LOWER_LIMIT_1 = 5000;
        public static final int LOWER_LIMIT_2 = 25000;
        public static final int LOWER_LIMIT_3 = 55000;
        public static final int LOWER_LIMIT_4 = 200000;
        public static final int LOWER_LIMIT_5 = 1000000;

        public static final int STARTING_TAX_1 = 100;
        public static final int STARTING_TAX_2 = 1700;
        public static final int STARTING_TAX_3 = 4700;
        public static final int STARTING_TAX_4 = 22100;
        public static final int STARTING_TAX_5 = 142100;

        public static final double TAX_RATE_1 = 0.08;
        public static final double TAX_RATE_2 = 0.10;
        public static final double TAX_RATE_3 = 0.12;
        public static final double TAX_RATE_4 = 0.15;
        public static final double TAX_RATE_5 = 0.17;
    }

    public static double calculateTax(int value) {
        if (value < Constants.LOWER_LIMIT_1) {
            return 0;
        } else if (value < Constants.LOWER_LIMIT_2) {
            return (Constants.STARTING_TAX_1 + (value - Constants.LOWER_LIMIT_1) * Constants.TAX_RATE_1);
        } else if (value < Constants.LOWER_LIMIT_3) {
            return (Constants.STARTING_TAX_2 + (value - Constants.LOWER_LIMIT_2) * Constants.TAX_RATE_2);
        } else if (value < Constants.LOWER_LIMIT_4) {
            return (Constants.STARTING_TAX_3 + (value - Constants.LOWER_LIMIT_3) * Constants.TAX_RATE_3);
        } else if (value < Constants.LOWER_LIMIT_5) {
            return (Constants.STARTING_TAX_4 + (value - Constants.LOWER_LIMIT_4) * Constants.TAX_RATE_4);
        } else {
            return (Constants.STARTING_TAX_5 + (value - Constants.LOWER_LIMIT_5) * Constants.TAX_RATE_5);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int value = Integer.parseInt(scan.nextLine());

        double tax = calculateTax(value);

        System.out.println(tax != 0 ? "Tax: " + tax : "No tax!");

        scan.close();

    }
}
