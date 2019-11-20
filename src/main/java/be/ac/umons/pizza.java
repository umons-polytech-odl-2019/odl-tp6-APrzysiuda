package be.ac.umons;

import java.math.BigDecimal;
import java.util.ArrayList;

public class pizza implements PizzaComponent {

    private String Name;
    private BigDecimal price= BigDecimal.valueOf(0);
    private ArrayList<Ingredient> listIngredients;

    public pizza (String name){
        Name = name;
        listIngredients = new ArrayList<>();
    };

    public String getName(){
        return this.Name;
    }
    public BigDecimal getPrice(){
        return this.price;
    }
    public void setName(String n){
        Name=n;
    }
    public void setPrice(BigDecimal p){
        price =p;
    }

    public ArrayList<Ingredient> getListIngredients() {
        return listIngredients;
    }
    public void addIngredient(Ingredient i){
        listIngredients.add(i);
    }

    public String toString(){
        return super.toString();
    }

}
