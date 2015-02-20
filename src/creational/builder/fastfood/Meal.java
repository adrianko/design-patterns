package creational.builder.fastfood;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    
    private List<Item> items = new ArrayList<>();
    
    public void addItem(Item it) {
        items.add(it);
    }
    
    public float getCost() {
        float cost = 0.0f;
        
        for (Item it : items) {
            cost += it.price();
        }
        
        return cost;
    }
    
}