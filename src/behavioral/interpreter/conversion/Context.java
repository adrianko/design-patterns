package behavioral.interpreter.conversion;

public class Context {
    
    private String question = "";
    private String response = "";
    private String from = "";
    private String to = "";
    private double quantity;
    
    String[] parts;
    
    public Context(String in) {
        question = in;
        parts = getInput().split(" ");
        from = getCapitalised(parts[1]);
        to = getLowercase(parts[3]);
        quantity = Double.valueOf(parts[0]);
        response = parts[0] + " " + parts[1] + " equals ";
    }

    public String getInput() {
        return question;
    }
    
    public String getFrom() {
        return from;
    }
    
    public String getTo() {
        return to;
    }
    
    public String getResponse() {
        return response;
    }
    
    public double getQuantity() {
        return quantity;
    }
    
    public String getLowercase(String w) {
        return w.toLowerCase();    
    }
    
    public String getCapitalised(String w) {
        String wc = Character.toUpperCase(w.charAt(0)) + w.toLowerCase().substring(1);
        
        if (w.charAt(w.length() - 1) != 's') {
            wc = new StringBuffer(wc).insert(wc.length(), "s").toString();
        }
        
        return wc;
    }
    
}