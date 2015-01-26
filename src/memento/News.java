package memento;

public class News {
    
    public static void main(String[] args) {
        int currArticle = 0;
        Caretaker c = new Caretaker();
        Originator o = new Originator();
        
        o.set("Some text");
        c.add(o.store());
        currArticle++;

        o.set("Some more text");
        c.add(o.store());
        currArticle++;

        o.set("Even more text");
        c.add(o.store());
        currArticle++;
        o.restore(c.get(--currArticle));
        o.restore(c.get(--currArticle));
        o.restore(c.get(--currArticle));
        currArticle += 2;
        o.restore(c.get(currArticle));
    }
    
}