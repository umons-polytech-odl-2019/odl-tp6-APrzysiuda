package be.ac.umons;

import java.util.Map;

public class Carbonara extends pizza {
    Carbonara(String name, Map<String,Ingredient> ingredients) {
        super("Carbonara");
        addIngredient(ingredients.get("Dough"));
        addIngredient(ingredients.get("White Cream"));
        addIngredient(ingredients.get("Cheese"));
        addIngredient(ingredients.get("Ham"));

    }
}
