package be.ac.umons;

import java.util.Map;

public class Prosciuttohut extends Prosciutto {
    Prosciuttohut(String name, Map<String, Ingredient> ingredients) {
        super("ProsciuttoHut", ingredients);
        addIngredient(ingredients.get("Olive"));
    }
}
