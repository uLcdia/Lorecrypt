
import java.util.Scanner;

public class LiquidContainers2 {
    private static Container firstContainer = new Container();
    private static Container secondContainer = new Container();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            print();

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            try {
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (command.equals("add")) {
                    add(amount);
                } else if (command.equals("move")) {
                    move(amount);
                } else if (command.equals("remove")) {
                    remove(amount);
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

    private static void add(int amount) {
        firstContainer.add(amount);
    }

    private static void move(int amount) {
        firstContainer.move(secondContainer, amount);
    }

    private static void remove(int amount) {
        secondContainer.remove(amount);
    }

    private static void print() {
        System.out.println("First: " + firstContainer);
        System.out.println("Second: " + secondContainer);
    }
}
