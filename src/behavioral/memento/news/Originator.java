package behavioral.memento.news;

public class Originator {
    
    private String article;
    
    public void set(String ar) {
        System.out.println("From Originator - Current version: ");
        System.out.println(ar);
        article = ar;
    }
    
    public Memento store() {
        System.out.println("From Originator - Saving to Memento");
        
        return new Memento(article);
    }
    
    public String restore(Memento m) {
        article = m.getSavedArticle();
        System.out.println("From Originator - previous");
        System.out.println(article);
        
        return article;
    }
    
}