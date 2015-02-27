package behavioral.iterator.name;

public class TestIterator {
    
    public static void main(String[] args) {
        NameRepository nr = new NameRepository();
        Iterator it = nr.getIterator();
        
        while(it.hasNext()) {
            System.out.println("Name: " + it.next().toString());
        }
    }
    
}