package structural.decorator.pizza;

public class Pizzaria {

    /**
     * Decorator - allows modification of an object dynamically. Capabilities
     * of inheritance with subclasses but can add functionality at runtime.
     * @param args
     */
    public static void main(String[] args) {
        Pizza p = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + p.getDescription());
        System.out.println("Price: "+ p.getCost());
    }

}