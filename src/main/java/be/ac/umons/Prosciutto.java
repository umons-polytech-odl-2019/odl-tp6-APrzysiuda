package be.ac.umons;

import java.util.Map;

public class Prosciutto extends pizza {
    Prosciutto(String name, Map<String, Ingredient> ingredients) {
        super("Prosciutto");
        addIngredient(ingredients.get("Dough"));
        addIngredient(ingredients.get("Tomato Sauce"));
        addIngredient(ingredients.get("Cheese"));
        addIngredient(ingredients.get("Ham"));
    }
}
