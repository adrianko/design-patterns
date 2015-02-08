package creational.prototype;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is made");
    }

    public Animal makeCopy() {
        System.out.println("Making sheep");
        Sheep s = null;

        try {
            s = (Sheep) super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return s;
    }

    public String toString() {
        return "I am a sheep";
    }

}
