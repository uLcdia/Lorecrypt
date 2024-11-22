import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n" +
                                "1 - add a joke\n" +
                                "2 - draw a joke\n" +
                                "3 - list jokes\n" +
                                "X - stop");
            String inputCommand = scanner.nextLine();
            
            if (inputCommand.equals("1")) {
                System.out.println("Write the joke to be added:");
                String inputJoke = scanner.nextLine();
                jokeManager.addJoke(inputJoke);
            } else if (inputCommand.equals("2")) {
                System.out.println(jokeManager.drawJoke());
            } else if (inputCommand.equals("3")) {
                jokeManager.printJokes();
            } else if (inputCommand.equals("X")) {
                break;
            } /* else {
                
            } */
        }
    }
}
