package be.ac.umons;

import java.util.Map;

public class FruttiDiMare extends pizza {
    FruttiDiMare(String name, Map<String,Ingredient> ingredients) {
        super("FruttiDiMare");
        addIngredient(ingredients.get("Dough"));
        addIngredient(ingredients.get("Tomato Sauce"));
        addIngredient(ingredients.get("Cheese"));
        addIngredient(ingredients.get("Sea food"));

    }
}
