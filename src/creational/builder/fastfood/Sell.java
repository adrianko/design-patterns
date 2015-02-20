package creational.builder.fastfood;

public class Sell {
    
    public static void main(String[] args) {
        Combos c = new Combos();
        Meal vegMeal = c.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
        
        Meal nonVegMeal = c.prepareNonVegMeal();
        System.out.println("\nNon Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
    
}