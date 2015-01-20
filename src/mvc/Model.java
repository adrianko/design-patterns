package mvc;

public class Model {

    private int result;

    public void add(int p, int q) {
       result = p + q;
    }

    public int getResult(){
        return result;

    }

}