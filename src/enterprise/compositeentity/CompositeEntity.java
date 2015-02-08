package enterprise.compositeentity;

public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String d1, String d2) {
        cgo.setData(d1, d2);
    }

    public String[] getData() {
        return cgo.getData();
    }

}