package behavioral.visitor;

public class Tourist {

    /**
     * Allows addition of methods to classes of different types without much
     * altering those classes. Can make completely different methods depending
     * on the class used with this pattern
     * @param args
     */
    public static void main(String[] args) {
        TaxVisitor tv = new TaxVisitor();
        TaxHolidayVisitor thv = new TaxHolidayVisitor();
        
        Necessity milk = new Necessity(0.99);
        Alcohol vodka = new Alcohol(15.00);
        Tobacco cigars = new Tobacco(25.00);

        System.out.println("Normal Price");
        System.out.println("Milk: " + milk.accept(tv));
        System.out.println("Vodka: " + vodka.accept(tv));
        System.out.println("Cigars: " + cigars.accept(tv));

        System.out.println("\nHoliday Price");
        System.out.println("Milk: " + milk.accept(thv));
        System.out.println("Vodka: " + vodka.accept(thv));
        System.out.println("Cigars: " + cigars.accept(thv));
    }
    
}