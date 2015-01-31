package multiton;

public class Run {

    /**
     * Multiton - an extension of the Singleton pattern that keeps
     * instances of the singleton in a map referred to by a key,
     * therefore producing a multiton.
     * @param args
     */
    public static void main(String[] args) {
        Multiton m1_1 = Multiton.getInstance("m1");
        Multiton m2_1 = Multiton.getInstance("m2");

        Multiton m1_2 = Multiton.getInstance("m1");
        Multiton m2_2 = Multiton.getInstance("m2");

        System.out.println(m1_1.hashCode());
        System.out.println(m1_2.hashCode());

        System.out.println(m2_1.hashCode());
        System.out.println(m2_2.hashCode());
    }

}