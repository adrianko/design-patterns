package memento;

public class News {
    
    public static void main(String[] args) {
        int currArticle = 0, saveFiles = 0;
        Caretaker c = new Caretaker();
        Originator o = new Originator();
        
        o.set("Some text");
        c.add(o.store());
        currArticle++;
        saveFiles++;
    }
    
}