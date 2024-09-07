import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        String result = IntStream.of(array)
                                 .mapToObj(String::valueOf)             // Convert int to String
                                 .collect(Collectors.joining(", "));    // Join the Strings

        System.out.println(result);
    }
}
