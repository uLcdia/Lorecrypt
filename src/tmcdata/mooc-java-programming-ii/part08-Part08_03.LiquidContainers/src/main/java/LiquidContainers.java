
import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int MAX_AMOUNT = 100;

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + MAX_AMOUNT);
            System.out.println("Second: " + secondContainer + "/" + MAX_AMOUNT);

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            try {
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (command.equals("add")) {
                    if (amount > 0) {
                        int amountSum = firstContainer + amount;
                        if (amountSum > MAX_AMOUNT) {
                            amountSum = MAX_AMOUNT;
                        }
                        firstContainer = amountSum;
                    }
                } else if (command.equals("move")) {
                    int amountMoved = 0;
            
                    if (firstContainer - amount < 0) {
                        amountMoved = firstContainer;
                        firstContainer = 0;
                    } else {
                        amountMoved = amount;
                        firstContainer -= amount;
                    }
                    
                    int amountSum = secondContainer + amountMoved;
                    if (amountSum > MAX_AMOUNT) {
                        amountSum = MAX_AMOUNT;
                    }
                    secondContainer = amountSum;
                } else if (command.equals("remove")) {
                    if (secondContainer - amount < 0) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= amount;
                    }
                } else {
                    System.out.println("Unknown command");
                }
            } catch (IndexOutOfBoundsException e) {
                if (input.equals("quit")) {
                    break;
                }
                System.out.println("Please provide a command and an amount.");
                continue;
            } catch (NumberFormatException e) {
                System.out.println("Amount must be an integer.");
                continue;
            }
        }

        scan.close();
    }
}
