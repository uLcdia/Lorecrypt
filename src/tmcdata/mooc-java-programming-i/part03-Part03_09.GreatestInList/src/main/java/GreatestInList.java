
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        scanner.close();

        System.out.println("The greatest number: " + getGreatest(list));
        
    }

    private static int getGreatest(ArrayList<Integer> list) {
        int greatest = list.get(0);
        
        for (int number : list) {
            greatest = (number > greatest) ? number : greatest;
        }

        return greatest;
    }
}
