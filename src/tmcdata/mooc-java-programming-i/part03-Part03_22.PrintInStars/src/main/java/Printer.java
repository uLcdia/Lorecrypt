import java.util.Arrays;

public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        Arrays.stream(array)
              .forEach(Printer::printStars);
    }

    private static void printStars(int count) {
        System.out.print("*".repeat(count));
        System.out.println();
    }
}
