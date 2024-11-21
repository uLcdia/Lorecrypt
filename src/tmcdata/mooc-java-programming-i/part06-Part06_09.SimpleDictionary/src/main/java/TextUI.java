import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String inputCommand = scanner.nextLine();

            if (inputCommand.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (inputCommand.equals("add")) {
                this.add();
            } else if (inputCommand.equals("search")) {
                this.search();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    private void add() {
        System.out.print("Word: ");
        String inputWord = scanner.nextLine();
        System.out.print("Translation: ");
        String inputTranslation = scanner.nextLine();
        simpleDictionary.add(inputWord, inputTranslation);
    }

    private void search() {
        System.out.print("To be translated: ");
        String inputWord = scanner.nextLine();
        String translation = simpleDictionary.translate(inputWord);

        if (translation != null) {
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Word " + inputWord + " was not found");
        }
    }
}
