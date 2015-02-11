package creational.prototype.animal;

public class CloneFactory {

    public Animal getClone(Animal a) {
        return a.makeCopy();
    }

}