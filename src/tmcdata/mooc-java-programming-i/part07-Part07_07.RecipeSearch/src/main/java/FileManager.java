import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    public static Recipes readRecipes(String file) {
        Recipes recipes = new Recipes();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int cookingTime = Integer.parseInt(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                String line = "";
                while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
                    ingredients.add(line);
                }
                recipes.addRecipe(name, cookingTime, ingredients);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return recipes;
    }
}
