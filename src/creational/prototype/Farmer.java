package creational.prototype;

public class Farmer {

    /**
     * For creating new objects by cloning other objects
     * @param args
     */
    public static void main(String[] args) {
        CloneFactory cf = new CloneFactory();

        Sheep s1 = new Sheep();
        Sheep s2 = (Sheep) cf.getClone(s1);

        System.out.println("s1: " + s1.hashCode());
        System.out.println("s2: " + s2.hashCode());
    }

}