import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Recipes recipes;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("File to read: ");
        String file = this.scanner.nextLine();
        this.recipes = FileManager.readRecipes(file);
        this.printCommands();
        this.loop();
    }

    public void printCommands() {
        System.out.println("Commands:\n" + //
                        "list - lists the recipes\n" + //
                        "stop - stops the program\n" + //
                        "find name - searches recipes by name\n" + //
                        "find cooking time - searches recipes by cooking time\n" + //
                        "find ingredient - searches recipes by ingredient");
    }

    public void loop() {
        while (true) {
            System.out.print("Enter command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                this.list();
            } else if (command.equals("find name")) {
                this.findName();
            } else if (command.equals("find cooking time")) {
                this.findCookingTime();
            } else if (command.equals("find ingredient")) {
                this.findIngredient();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public void list() {
        for (Recipe recipe : this.recipes.getRecipes()) {
            System.out.println(recipe);
        }
    }

    public void findName() {
        System.out.print("Searched word: ");
        String word = this.scanner.nextLine();
        this.recipes.getRecipesByName(word).forEach(System.out::println);
    }

    public void findCookingTime() {
        System.out.print("Max cooking time: ");
        int time = Integer.parseInt(this.scanner.nextLine());
        this.recipes.getRecipesByCookingTime(time).forEach(System.out::println);
    }

    public void findIngredient() {
        System.out.print("Ingredient: ");
        String ingredient = this.scanner.nextLine();
        this.recipes.getRecipesByIngredients(ingredient).forEach(System.out::println);
    }
}

