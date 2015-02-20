package creational.builder.fastfood;

public class Fanta extends ColdDrink {
    
    @Override
    public String name() {
        return "Fanta";
    }

    @Override
    public float price() {
        return 25.0f;
    }
    
}