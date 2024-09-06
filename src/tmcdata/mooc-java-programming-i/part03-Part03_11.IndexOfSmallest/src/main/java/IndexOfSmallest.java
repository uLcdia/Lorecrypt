
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        // indices for min numbers
        ArrayList<Integer> indices = new ArrayList<Integer>();

        // min would be smaller than 9999
        int min = 9999;
        Scanner scanner = new Scanner(System.in);

        // read numbers and store min number indices
        int i = 0;
        while(true) {
            int number = Integer.parseInt(scanner.nextLine());
            // stop reading when get 9999
            if (number != 9999) {
                // reset indices for new min
                if (number < min) {
                    min = number;
                    indices.clear();
                    indices.add(i);
                } else if (number == min) {
                    indices.add(i);
                }
                i++;
            } else {
                break;
            }
        }
        scanner.close();

        System.out.println("Smallest number: " + min);

        for (int index : indices) {
            System.out.println("Found at index: " + index);
        }
    }
}
