package be.ac.umons;

import java.util.Map;

public class Margherita extends pizza {
    Margherita(String name, Map<String,Ingredient> ingredients) {
        super("Margherita");
        addIngredient(ingredients.get("Dough"));
        addIngredient(ingredients.get("Tomato Sauce"));
        addIngredient(ingredients.get("Cheese"));
    }


}
