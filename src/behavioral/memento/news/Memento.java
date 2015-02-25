package behavioral.memento.news;

public class Memento {
    
    private String article;
    
    public Memento(String ar) {
        article = ar;
    }
    
    public String getSavedArticle() {
        return article;
    }
    
}