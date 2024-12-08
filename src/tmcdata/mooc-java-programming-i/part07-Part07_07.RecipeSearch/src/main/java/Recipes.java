import java.util.ArrayList;
import java.util.stream.Collectors;

public class Recipes {
    private ArrayList<Recipe> recipes;

    public Recipes() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.recipes.add(new Recipe(name, cookingTime, ingredients));
    }

    public ArrayList<Recipe> getRecipesByName(String name) {
        return this.recipes.stream()
                            .filter(recipe -> recipe.getName().contains(name))
                            .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Recipe> getRecipesByCookingTime(int cookingTime) {
        return this.recipes.stream()
                            .filter(recipe -> recipe.getCookingTime() <= cookingTime)
                            .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Recipe> getRecipesByIngredients(String ingredient) {
        return this.recipes.stream()
                            .filter(recipe -> recipe.getIngredients().contains(ingredient))
                            .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }
}
