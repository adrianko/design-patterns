package creational.prototype.shape;

public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public String getType() {
        return type;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

}